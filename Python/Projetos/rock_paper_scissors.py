import random

user_wins = 0
computer_wins = 0
options = ["rock", "paper", "scissors"]

print("Welcome to Rock Paper Scissors!\nRock beats Scissors.\nPaper beats Rock.\nScissors beat Paper.")


while True:
    user_input = input("Rock/Paper/Scissors or Q to quit: ").lower()
    if user_input == 'q':
        print(f"Game ended! You got {user_wins} point(s) and computer got {computer_wins} point(s).")
        quit()

    if user_input not in ["rock", "paper", "scissors"]:
        print("Type in rock/paper/scissors")
        continue
    
    random_number = random.randint(0,2)                                     # rock: 0/paper: 1/scissors: 2
    computer_pick = options[random_number]
    print(f"Computer picked {computer_pick}.")
    print(f"You picked {user_input}.")
    if user_input == "rock" and computer_pick == "scissors":
        print("You won!")
        user_wins+=1

    elif user_input == "paper" and computer_pick == "rock":
        print("You won!")
        user_wins+=1    

    elif user_input == "scissors" and computer_pick == "paper":
        print("You won!")
        user_wins+=1    

    elif (user_input == "rock" and computer_pick == "rock") or (user_input == "paper" and computer_pick == "paper") or (user_input == "scissors" and computer_pick == "scissors"):
        print("Tied!")

    else:
        print("You lost!")
        computer_wins+=1
    
