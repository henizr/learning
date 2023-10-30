from collections import namedtuple

Colors = namedtuple("Colors", ['green', 'red', 'yellow'])
colors = Colors(green=10, red=20, yellow=25)

print(colors.green)
colors.red = ""

