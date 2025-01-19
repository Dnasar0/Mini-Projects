import socket

SERVER_IP = '10.0.2.15'
SERVER_PORT = 5678


with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((SERVER_IP, SERVER_PORT))
    data = s.recv(1024)
    print(data.decode('ascii'))