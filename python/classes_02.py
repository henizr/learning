class Berenjena:
    def __init__(self):
        self.__name = 'berenjena'

    def __str__(self) -> str:
        return self.__name
    
    @property
    def name(self):
        return self.__name
    
    @name.setter
    def name(self, name):
        self.__name = name
    
berenjena = Berenjena()
print(berenjena.name)
berenjena.name = 'naranja + berenjena'
print(berenjena.name)
