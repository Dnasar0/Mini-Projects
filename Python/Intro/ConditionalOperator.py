x = 'hello'
y = 3
z = 'yes'
a = 'a'
Z = 'Z'
true = 1 == 1                         # é verdade, logo tem True
false = 1 == 0                        # é falso, logo tem False
# x == y                              # traduz para: x é igual a y
# x != y                              # traduz para: x é diferente de y
# x <(=) y                            # traduz para: x é menor(ou igual) a y
# x >(=) y                            # traduz para: x é maior(ou igual) a y
result1 = true and false              # and implica que só seja verdadeira se ambos forem verdadeiros
result2 = true or false               # só precisa de ter um verdadeiro para ser verdadeiro
result3 = not true                    # not = inverso = false
result4 = not false                   # not = inverso = true
print(x * y)                          # repete a mesma string y vezes
print(x + z)                          # adiciona uma string à outra
print(x==z)                           # mostra True se as strings forem iguais, False caso contrário
print(x!=z)                           # mostra True se as strings forem diferentes, False caso contrário
print(a > Z)                          # valores específicos das letras, uns são maiores que outross
print(ord(a))
print(ord(Z))
print(true)
print(false)
print("And:", result1)
print("Or:", result2)
print("Not true:", result3)
print("Not false:", result4)