import random

gen = [i+j for i, j in zip(range(101), range(11, 1001)) if i %2 == 0 and j %2 != 0]

print(gen)

dic = {a:random.randint(1,10) for a in ['q', 'w', (1,1), 'c', '00', '&']}

print(dic)