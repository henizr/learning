# print([1,2,32,2,1,1].count(1))
# print(list(map(  lambda a: a*11, [1,2,4,10])))

# cups = int(input(">"))
# print(cups//6)

# turkey = int(input(">")) * 2
# pigs = int(input(">")) * 4
# cows = int(input(">")) * 4

# print(turkey + pigs  + cows)

from collections import Counter



nums = [11,1,1,1]
nums2 = [5,5,211,5]
count1 =  Counter(nums)
count2 =  Counter(nums2)
print(count1 - count2)

import itertools

# for i in itertools.cycle([0,1]):
#     print(i)


for result in itertools.accumulate([0,1, 2,3,4,5]): '''iterating'''
print(result)