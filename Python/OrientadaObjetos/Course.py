
class Student:                                                  # classe secundária
    def __init__(self, name, age, grade):                       # construtor
        self.name = name
        self.age = age
        self.grade = grade

    def get_grade(self):                                        # recebe a nota do atual aluno
        return self.grade


class Course:                                                   # utiliza a classe secundária
    def __init__(self, name, max_students):                     # construtor
        self.name = name
        self.max_students = max_students
        self.students = []

    def add_student(self, student):                             # adiciona um aluno da classe secundária
        if len(self.students) < self.max_students:
            self.students.append(student)
            return True
        return False                                            # falso se ultrapasssar o limite de alunos

    def get_average_grade(self):
        value = 0
        for student in self.students:
            value += student.get_grade()
        return value / len(self.students)                       # média das notas dos alunons

s1 = Student("Tim", 19, 95)
s2 = Student("Bill", 19, 75)
s3 = Student("Jill", 18, 65)

course = Course("Science", 2)
course.add_student(s1)
course.add_student(s2)
print(course.get_average_grade())

