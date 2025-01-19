# Programa que pede um número ao jogador e diz se coincide com o número gerado automaticamente ou não

import random

print(f"Welcome to the guessing game! The hidden number is between {1} and {11}.")
random_number = random.randint(0,11)                                                            # num aleatório entre 1 e 11 inclusive
guesses = 0                                                                                     # número de tentativas que foram feitas
    


while True:
    guesses+=1
    user_guess = input("Make a guess: ")
    if user_guess.isdigit() and user_guess.isdigit() > 0 and user_guess.isdigit() < 12: 
        user_guess = int(user_guess)                                                            # transforma o número num inteiro
    else:
        print("Please type in an input of an integer above 0 and below 12: ")
        continue

    if user_guess == random_number:
        print(f"You got it right in {guesses} tries! The number was {random_number}")
        break
    elif user_guess > random_number:
            print("You were above the number.")
            print("Try again! ")
    elif user_guess < random_number:
            print("You were below the number.")
            print("Try again! ")
