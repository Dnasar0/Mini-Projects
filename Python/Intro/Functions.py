def function(x,y, z = None):
        print("Run", x, y, z)          # faz print de "Run" e dos argumentos
        return x * y, x / y         # retorna resultado

r1, r2 = function(4,3,7)              # guarda resultados em variáveis
print(r1,r2)                        # print das variáveis