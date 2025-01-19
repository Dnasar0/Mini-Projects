import socket

SERVER_IP = '10.0.2.15'
SERVER_PORT = 5678


with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.bind((SERVER_IP, SERVER_PORT))
    print("Server listening...")
    s.listen(1)
    conn, addr = s.accept()
    print(f'Connection established from {addr}')
    with conn:
        while True:
            conn.send(b'hello world!')
            break