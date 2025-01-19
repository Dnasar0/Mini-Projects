from multiprocessing import Condition


x = [1,2,3,4]

i = 0

while i < 10:                   # loop itera, cada vez mostrando "Run"
    print("Run")
    i+=1

while True:                     # loop infinito
    print("run")
    i+=1
    if i == 10:
        break                   # quebra o loop
