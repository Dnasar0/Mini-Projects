# Programa que faz a gestão de password através de um ficheiro de texto

from cryptography.fernet import Fernet                                          # módulo para encriptar mensagens
'''
def write_key():
    key = Fernet.generate_key()                                                 # cria um ficheiro de chave
    with open("key.key", "wb") as key_file:
        key_file.write(key)'''

def load_key():
    file = open("key.key", "rb")
    key = file.read()
    file.close()
    return key


key = load_key()
fer = Fernet(key)


def view():
    with open("password.txt ", 'r') as f:                                       # lê ficheiro
    # 'w' para limpar o ficheiro e escreve um novo
    # 'r' para ler o ficheiros 
    # 'a' para adicionar algo no final de um ficheiro, cria um novo se não existe
        for line in f.readlines():
            data = line.rstrip()                                                # elimina o \n
            user, passw = data.split('|')
            print(f"User: {user} | Password: {fer.decrypt(passw.encode()).decode()}")

def add():
    name = input("Account name: ")
    pwd = input("Password: ")

    with open("password.txt ", 'a') as f:                                       # abre ficheiro de texto e altera, fecha
        f.write(f"{name}|{fer.encrypt(pwd.encode()).decode()}\n")
    

 

while True:
    mode = input("Would you like to add a new password or view existing ones (view,add) or press q to quit? ").lower()
    if mode == "q":
        break

    if mode == "view":
        view()
    elif mode == "add":
        add()
    else:
        print("Invalid mode.")
        continue