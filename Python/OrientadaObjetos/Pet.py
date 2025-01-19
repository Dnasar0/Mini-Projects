
class Pet:                                                          # classe hereditária
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print(f"I am {self.name} and I am {self.age} years old.")

    def speak(self):
        print("I don't know LOL")

class Cat(Pet):                                                     # chamar a classe principal
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color

    def speak(self):                                                
        print("meow")

    def show(self):
        print(f"I am {self.name}, I am {self.age} years old and I am {self.color}")        

class Dog(Pet):
    def speak(self):
        print("bark")

class Fish(Pet):
    pass

p = Pet("Tim", 4)
p.show()
c = Cat("Bill", 6, "orange")
c.show()
d = Dog("Jill", 7)
d.speak()
f = Fish("Bubbles", 2)