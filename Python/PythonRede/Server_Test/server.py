import socket
import time 
import pickle

HEADERSIZE = 10

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((socket.gethostname(), 1234))       # Este método recebe dois parâmetros: 
                                           # 1º é o IP do host 
                                           # 2º porta definida
print("Server is listening...")
s.listen(5)                                # Temos no máximo 5 conexões que podem ser feitas para o servidor, sendo que as a mais serão recusadas

# Loop infinito até interrompermos a conexão / ocorrer um erro
while True:
    clientsocket, address = s.accept()     # Conexão e endereço de um cliente
    print(f"Connection from {address} has been established!")

    d = {1: "Hey", 2: "There"}                      # Objeto que vamos enviar como pickle
    msg = pickle.dumps(d)

    msg = bytes(f"{len(msg):<{HEADERSIZE}}", "utf-8") + msg

    clientsocket.send(msg) # Converter a mensagem em bytes

    quit = input("Type in 'quit' to quit: ")
    if quit.lower() == "quit":
        break
print("Server closed.")
s.close()
