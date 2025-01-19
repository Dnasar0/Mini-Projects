# Socket Programming in Python

import socket
import sys

# Análise do comando: socket.socket(socket.AF_INET, socket.SOCK_STREAM):
                   
# 1º parâmetro (socket.AF_INET) refere à família IPv4, a qual vamos analisar                                
# 2º parâmetro (socket.SOCK_STREAM) refere à conexão orientada a um protocolo TCP (Transmission Controlled Protocol), que define uma conexão sem
# transferência de dados

try:
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    print("socket successfully created!")
except socket.error as err:
    print(f"socket creation failed with error {err}")

#ip = socket.gethostbyname("www.github.com")                                # Uma maneira de arranjar o IP de um site
#print(ip)                                                                           

port = 80

try:
    host_ip = socket.gethostbyname("www.github.com")
except socket.gaierror:                                                     # Exceção afirma que há um erro no DNS (Domain Name Service)
    print("error resolving the host")
    sys.exit()
s.connect((host_ip, port))                                                  # Para conectar, precisamos do IP e da porta
print(f"socket has successfully connected to Github on port == {host_ip}")