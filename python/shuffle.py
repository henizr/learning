import random

array = [[100, 10, 1, 190, -9000], [80000, 10, 1, 19110, -9000], [10, 1, 590, 6000, 1008]]

print(array)


for i in range(0, len(array)):
    random_index = random.randint(0, len(array) - 1)
    array[i], array[random_index] = array[random_index], array[i]

for item in array:
    for i in range(1, len(item)):
        random_index = random.randint(1, len(array) - 1)
        item[i], item[random_index] = item[random_index], item[i]


print(array)
