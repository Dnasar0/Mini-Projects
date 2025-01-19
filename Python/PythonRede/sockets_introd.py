'''Socket Programming in Python'''
import socket 
import sys 

try:
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    print('socket successfully created!')
except socket.error as err:
    print(f'socket creation failed with error {err}')
# Esta variável é um socket, e tem dois parâmetros:
# 1º é o AF_INET, refere-se ao protocolo de Internet IPv4, o mais comum da Internet 
# 2º é o SOCK_STREAM, refere-se ao protocolo de transporte TCP
# Caso haja um problema na conexão do socket, é lançado um erro 

# ip = socket.gethostbyname('www.github.com') dá-nos o IP do site 

port = 80

try:
    host_ip = socket.gethostbyname('www.github.com')
except socket.gaierror:
    print('error resolving the host')
    sys.exit()
s.connect((host_ip, port))
print(f'Socket has successfully connected to Github on port == {host_ip}')
