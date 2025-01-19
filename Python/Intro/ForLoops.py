#for i in range(10):                         # loop para mostrar números de 1 a 9, não inclui 10
#    print(i)

for i in range(3,10):                        # loop para mostrar os números de 3 a 9, não inclui 10
    print(i)

for i in range(1,10,2):                      # loop para mostrar os números de 1 a 10, 2 em 2
    print(i)

# o start tem de ser obrigatoriamente menor que o stop (range(start, stop, step))

x = [1,2,3,4]
for i in range(len(x)):                     # loop para mostrar os elementos da lista x
    print(x[i])

for i, element in enumerate(x):             # loop para mostrar o indíce e o respetivo elemento da lista
    print(i, element)