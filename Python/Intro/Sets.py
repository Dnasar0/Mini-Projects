x = set()
s = {4,32,2,2}                      # lista feita de uma forma diferente, sem duplicados
s.remove(2)
s2 = {4}
print(4 in s)                       # True se 4 estiver em s, False caso contrário. Operação mais rápida em sets do que em listas

print(s.intersection(s2))
