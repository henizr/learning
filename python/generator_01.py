import random

gen = [i + j for i, j in zip(range(1,10), range(100, 200)) if i %2 == 0]
# print(gen)

dic = {a: random.randint(1,10) for a in ['q', 'f', 'g', 'p', 'd'] }
print(dic) 