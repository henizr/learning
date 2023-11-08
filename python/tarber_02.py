import itertools
import time
from collections import defaultdict

# for item in itertools.cycle(range(10000)):
#     print(item)
#     time.sleep(0.5)



# for result in itertools.accumulate(
#     [10, 100, 101, -1, 1],
#     lambda a, b: a*b):
#     """accumulation"""

# print(result)


# def_dict = defaultdict(lambda : 'default value')
# def_dict["id"] = 1

# print(def_dict["id"])
# print(def_dict["name"])


from pprint import pprint

# nums = [1,2,3,4,5,6,7,8,9]
# dic = {'id': 1, 'name': 'Harry', 'email': 'harry@mail.ru'}
# print(dic)
# pprint(dic)

for i in itertools.cycle([1,2]):
    time.sleep(1)
    print(i)


