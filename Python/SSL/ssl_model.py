import ssl
import socket
import threading
import signal
import sys

# SSL Configuration
CERT_FILE = "cert.pem"
KEY_FILE = "key.pem"

# Global variables to manage connections
connections = {}
exit_event = threading.Event()
lock = threading.Lock()  # For thread-safe access to the `connections` dictionary

def clear_line():
    """Clear the current console line."""
    sys.stdout.write("\r")
    sys.stdout.flush()

def handle_peer_connection(connection, address, peer_id):
    """Handle incoming messages from a specific peer."""
    try:
        while not exit_event.is_set():
            data = connection.recv(1024)
            if not data:
                print(f"\n{peer_id} disconnected.")
                break
            clear_line()
            print(f"\r{peer_id}: {data.decode()}")
            print("You: ", end="", flush=True)  # Restore input prompt
    except Exception as e:
        if not exit_event.is_set():
            print(f"Error with {peer_id}: {e}")
    finally:
        with lock:
            del connections[peer_id]
        connection.close()

def handle_outgoing_messages():
    """Handle sending messages to connected peers."""
    try:
        while not exit_event.is_set():
            msg = input("You (peer_id or 'all'): ")
            if not msg:  # Skip if the message is empty
                continue
            if ":" not in msg:
                print("Invalid format. Use 'peer_id:message' or 'all:message'.")
                continue
            
            target, message = msg.split(":", 1)
            with lock:
                if target == "all":
                    # Broadcast the message to all peers
                    for peer_id, conn in connections.items():
                        conn.sendall(f"Broadcast from Server: {message}".encode())
                elif target in connections:
                    # Send to a specific peer
                    connections[target].sendall(f"Message from Server: {message}".encode())
                else:
                    print(f"No such peer: {target}")
    except Exception as e:
        if not exit_event.is_set():
            print(f"Error sending messages: {e}")

def start_server(port):
    """Start the server to listen for incoming connections."""
    context = ssl.create_default_context(ssl.Purpose.CLIENT_AUTH)
    context.load_cert_chain(certfile=CERT_FILE, keyfile=KEY_FILE)

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.bind(('localhost', port))
    server_socket.listen(5)  # Allow up to 5 simultaneous connections
    print(f"Server listening on port {port}...")

    with context.wrap_socket(server_socket, server_side=True) as secure_socket:
        while not exit_event.is_set():
            try:
                conn, addr = secure_socket.accept()
                peer_id = f"Peer-{addr[1]}"  # Use port as a unique identifier for the peer
                print(f"Connection established with {peer_id} ({addr})")

                with lock:
                    connections[peer_id] = conn

                threading.Thread(target=handle_peer_connection, args=(conn, addr, peer_id), daemon=True).start()
            except Exception as e:
                if not exit_event.is_set():
                    print(f"Error accepting connections: {e}")

def connect_to_peer(host, port):
    """Connect to a peer as a client."""
    context = ssl.create_default_context()
    context.load_verify_locations(cafile=CERT_FILE)

    with socket.create_connection((host, port)) as sock:
        secure_socket = context.wrap_socket(sock, server_hostname="localhost")
        print(f"Connected to peer ({host}, {port})")
        peer_id = f"Peer-{port}"
        with lock:
            connections[peer_id] = secure_socket

        threading.Thread(target=handle_peer_connection, args=(secure_socket, (host, port), peer_id), daemon=True).start()
        return secure_socket

def sigint_handler(signum, frame):
    """Handle SIGINT (Ctrl+C) to exit gracefully."""
    print("\nGracefully shutting down...")
    exit_event.set()  # Notify threads to stop
    with lock:
        for conn in connections.values():
            try:
                conn.close()
            except:
                pass
    sys.exit(0)

def start_peer():
    """Start the peer that can both send and receive messages."""
    signal.signal(signal.SIGINT, sigint_handler)  # Attach SIGINT handler

    choice = input("Do you want to (1) Listen for connections or (2) Connect to a peer? ")
    
    if choice == "1":
        port = int(input("Enter the port to listen on: "))
        threading.Thread(target=start_server, args=(port,), daemon=True).start()
    elif choice == "2":
        host = input("Enter the peer's hostname (e.g., localhost): ")
        port = int(input("Enter the peer's port: "))
        connect_to_peer(host, port)
    else:
        print("Invalid choice. Exiting.")
        return

    handle_outgoing_messages()

if __name__ == "__main__":
    start_peer()
