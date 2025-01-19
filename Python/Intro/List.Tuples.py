list = [4, True, "hi"]                       # listas podem ter qualquer tipo de variável
tuple = (1,2,3,4)                            # listas que não podem ser alteradas
list.append("hello")                         # adiciona um elemento à lista x
element = list.pop()                         # elimina um elemento da lista x e mete em z. Caso n ponhamos nada entre os (), é o elemento final
y = "h"
list[0] = 3                                  # podemos mudar o que está numa posição da lista  
#print(len(x), len(y))                       # mostra o número de elementos em x, mostra o número de caracteres na string y
print(list, element)