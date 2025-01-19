x = [1,46,14,23,4,2,8,6,3,23,7,43]

mp = map(lambda i: i + 2, x)                  # mapear todos os elementos de x com a função, adicionando 2 a cada elemento
flt = filter(lambda i: i % 2 == 0, x)         # escolhe os elementos da lista que são múltiplos de 2
print(list(mp))
print(list(flt))

