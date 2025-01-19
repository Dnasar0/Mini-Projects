class SmartTrafficLight:
    def __init__(self, st1, st2):
        self.st1 = st1
        self.st2 = st2
        
    def turngreen(self):
        if self.st1[0] > self.st2[0]:
            most_traffic = self.st1[1]
            self.st1[0] = 0
            return most_traffic
        elif self.st1[0] < self.st2[0]:
            most_traffic = self.st2[1]
            self.st2[0] = 0
            return most_traffic
        else:
            return None

t = SmartTrafficLight([42, '27th ave'], [72, '3rd st'])
print(t.turngreen())
print(t.turngreen())
print(t.turngreen())
        
