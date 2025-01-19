x = "Diogo"

def func(name):
    global x                            # variável global
    x = name

print(x)
func("changed")
print(x)