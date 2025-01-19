x1 = [x1 for x1 in range(5)]                       # lista com um loop de 0 a 4
x2 = [x2 + 5 for x2 in range(5)]                   # lista com um loop de 5 a 9           
x3 = [[x3 for x3 in range(5)] for x3 in range(2)]  # lista coom 2 listas de 0 a 4
x4 = {i for i in range(100) if i % 5 == 0}         # dicionário com múltiplos de 5, exceto o 100
print(x1)
print(x2)
print(x3)
print(x4)