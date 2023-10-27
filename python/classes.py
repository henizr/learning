class Shape:
    color = 'red'
    counter = 0

    def __init__(self) -> None:
        self.__name = 'triangle'
        Shape.counter += 1
        
    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, name):
        if name == '' or name == 0:
            return
        self.__name = name

    @classmethod
    def count(cls):
        print(cls.counter)

    @classmethod
    def info(cls):
        print('This class was created for shapes')

    @staticmethod
    def showAreaInfo():
        print('S = 2prr')

shape = Shape()
shape.color = 'blue'


# print(shape.color)
# print(Shape.color)

# Shape.count()

print(shape.name)
shape.name = ''
print(shape.name)

Shape.info()
Shape.showAreaInfo()


