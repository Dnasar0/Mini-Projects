# Programa que pede ao jogador respostas a perguntas, adicionando à pontuação caso esteja correta

print("Welcome to the Quiz Game!")                                  # mensagem boas vindas ao jogo

playing = input("Do you want to proceed? ")                         # pergunta se quer participar no jogo

if playing.lower() != "yes":                                        # assume que qualquer string com YES seja o comando para começar o jogo 
    quit()                                                          # caso não fôr, programa acaba

print("Okay, let's play...")

score = 0                                                           # pontuação incrementada cada vez que é acertada uma resposta
number_of_questions = 0                                             # pontuação máxima possível

answer = input("What does CPU stand for? ")
number_of_questions+=1
if answer.lower() == "central processing unit":
    print("Correct!")
    score+=1
else:
    print("Incorrect")

answer = input("What does GPU stand for? ")
number_of_questions+=1
if answer.lower() == "graphics processing unit":
    print("Correct!")
    score+=1    
else:
    print("Incorrect")

answer = input("What does RAM stand for? ")
number_of_questions+=1
if answer.lower() == "random acess memory":
    print("Correct!")
    score+=1    
else:
    print("Incorrect")    

answer = input("What does PSU stand for? ")
number_of_questions+=1
if answer.lower() == "power supply unit":
    print("Correct!")
    score+=1    
else:
    print("Incorrect") 

print(f"The game has ended! You got a score of {score} out of {number_of_questions} ({(score / number_of_questions) * 100} )%!")   