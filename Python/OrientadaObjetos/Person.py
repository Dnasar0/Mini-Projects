class Person:
    number_of_people = 0

    def __init__(self, name):
        self.name = name
        Person.add_person()

    @classmethod
    def number_of_people_(cls):                              # não há objeto, só está a atuar na classe
        return cls.number_of_people

    @classmethod
    def add_person(cls):
        cls.number_of_people += 1

p1 = Person("Tim")
p2 = Person("Jill")
#Person.number_of_people = 8                                 # é possível alterar um atributo de uma classe 

print(Person.number_of_people_())