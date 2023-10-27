from quiz import questions
import random

score = 0

for item in questions:
    indexItemFirst = random.randint(1, len(item)-1)
    indexItemSecond = random.randint(1, len(item)-1)
    indexItemThird = random.randint(1, len(item)-1)
    print(item[0])
    answer = input("1." +item[indexItemFirst] + " " + "2." +item[indexItemSecond] + " " + "3." +item[indexItemThird])

    if answer == "1":
        score += 1

print(score)
