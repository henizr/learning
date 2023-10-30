numbers = [1000, 100, 0, -90, 11]

def changeItem(item):
    return item * 90


result = list(map(lambda item: item * 4, numbers))

print(result)