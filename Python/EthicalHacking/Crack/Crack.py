import hashlib
# Programa para descodificar passwords

flag = 0

pass_hash = input("Enter md5 hash: ")                   # Aqui hash é um valor de 128 bits (32 caracteres) que representa uma password.

wordlist = input("File name: ")

try:
    pass_file = open(wordlist, "r")                     # Abrir ficheiro no modo ler
except:
    print("No file found.")
    quit()

for word in pass_file:

    enc_wrd = word.encode("utf-8")                      # Codificar password
    digest = hashlib.md5(enc_wrd.strip()).hexdigest()   # Traduzir password em hash

    if digest == pass_hash:                             # Verificar se existe uma password em hash igual à que escrevemos
        print(f"Password has been found.\nPassword is {word}")
        flag = 1
        break

if flag == 0:
    print(f"Password/Passphrase is not in the list.")