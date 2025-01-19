class Grid():
    def __init__(self, width, height):
        self.cols = width
        self.rows = height
        self.body = [['0' for y in range(width)] for x in range(height)]
    
    def plot_point(self, x, y):
        self.body[y-1][x-1] = 'X'
        
    def __repr__(self):
        return "".join(["{}\n".format("".join(self.body[r])) for r in range(self.rows)])[:-1]
    
    @property    
    def grid(self):
        return self.__repr__()      

g = Grid(5,5)
g.plot_point(1,2)
print(g.grid())