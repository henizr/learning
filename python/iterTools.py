import itertools


def accum(arr, func):
    for result in itertools.accumulate(arr, func):
        """"""    
        print(result)
    return result


accum_result = accum([1,2,3,4,5], lambda a, b: a*b)
print(accum_result)