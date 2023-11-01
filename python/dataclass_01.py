from dataclasses import dataclass

@dataclass(frozen=True)
class Seagull:
    name: str
    color: str
    speed: int

seagull = Seagull(name="Chij", color="yellow", speed=1.2)
print(seagull.color)
seagull.color = "red"
print(seagull.color)
print(seagull.speed)