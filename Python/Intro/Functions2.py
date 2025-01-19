def func(x):
    def func2():                         # função da função
        print(x)

    return func2

#print(func(2))                          # referência da função
#func(2)()                               # retorna '2'


def func3(*args, **kwargs):             # transforma elementos da lista em argumentos em si
    print(args, kwargs)

x =  [1,23,236323,2727]
func3(1,2,3,3,4,5, one=0, two=1)
print(x)
print(*x)                               # retorna "1 23 236323 2727"

def func4(x,y):
    print(x,y)

pairs = [(1,2), (3,4)]

for pair in pairs:
    func4(**{'x':2, 'y':5})             # 2 5
                                        # 2 5      



