import random

# Mensagem alvo que queremos encriptar, e o contrário
msg = "Hello world how are you today?"
print(f'Original message: {msg}')

encryption_level = 128 // 8     # Cada caracter são 8 bits
char_pool = ''                  # Lista com toods os caracteres possíveis

for i in range(0x00, 0x255):
    char_pool += chr(i)         # Preenche a variável com os caracteres

key = ''                        # Chave gerada
for i in range(encryption_level):
    key += random.choice(char_pool)     # Preenche a variável com um caracter aleatório da tabela

key_index = 0 
max_key_index = encryption_level - 1
encrypted_msg = ''              # Mensagem encriptada

for char in msg:
    encrypted_char = ord(char) ^ ord(key[key_index])    # XOR
    encrypted_msg += chr(encrypted_char)
    if key_index >= max_key_index:
        key_index = 0
    else:
        key_index = 1 
print(f'Encrypted message: {encrypted_msg}')

key_index = 0
decrypted_msg = ''

for char in encrypted_msg:
    decrypted_char = ord(char) ^ ord(key[key_index])
    decrypted_msg += chr(decrypted_char)
    if key_index >= max_key_index:
        key_index = 0
    else:
        key_index = 1
print(f'Decrypted message: {decrypted_msg}')