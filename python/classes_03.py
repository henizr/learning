from dataclasses import dataclass

@dataclass(frozen=True)
class Seagull:
    name: str = 'chij'
    color: str = 'white'
    speed: int = 1.21
    


seagull = Seagull()
seagull.color = 'white'

print(seagull.color, seagull.name, seagull.speed)