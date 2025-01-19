# Programação Orientada a Objetos

class Dog:                                  # construção de uma classe "Dog"

    def __init__(self, name, age):          # construtor
        self.name = name                    # atributo
        self.age = age

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def set_age(self, age):
        self.age = age

    def bark(self):                         # método dentro da classe
        print("bark")

d1 = Dog("Tim", 4)
d2 = Dog("Will", 6)
d1.set_age(5)
print(d1.get_name(), d1.get_age())
print(d2.get_name(), d2.get_age())