# Programa para decifrar um algoritmo de Júlio César

alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


def decipher_word(word):
    new_word = []
    for letter in word:
        new_word.append(decipher_letter(letter))

    return ''.join(str(letter) for letter in new_word)

def decipher_letter(letter):
    global alphabet

    letter = letter.upper()

    if letter in alphabet:
        if alphabet.index(letter) - 4 < 0:
            letter = alphabet[(len(alphabet) + alphabet.index(letter) - 5) % len(alphabet)]
        
        else:
            letter = alphabet[alphabet.index(letter) - 4]
    return letter

def cipher_word(word):
    new_word = []
    for letter in word:
        new_word.append(cipher_letter(letter))
    return ''.join(str(letter) for letter in new_word)

def cipher_letter(letter):
    global alphabet

    letter = letter.upper()

    if letter in alphabet:
        if alphabet.index(letter) + 4 > len(alphabet):
            letter = alphabet[(len(alphabet) + alphabet.index(letter) + 4) % len(alphabet)]
        
        else:
            letter = alphabet[alphabet.index(letter) + 4]
    return letter



