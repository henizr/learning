from collections import namedtuple

Duck = namedtuple("Berenjena", ['bill','tail'])

duck = Duck(bill='10',tail='1')
print(duck.bill)
print(duck.tail)
