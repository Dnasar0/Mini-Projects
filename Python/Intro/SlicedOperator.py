x = [0,1,2,3,4,5,6,7]
y = ["hi", "hello", "goodbye", "cya", "sure"]
s = "hello"

sliced1 = x[0:4:2]                       # x[start:stop:step] começa em 0, salta de 2 em 2, para no 4, não o inclui

sliced2 = x[4:2:-1]                      #                    começa em 4, vai para trás de 1 em 1, para no 2, não o inclui

print(sliced1)
print(sliced2)