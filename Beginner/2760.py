
first = input()
second = input()
third = input()

slice_conf = slice(10)
print("{}{}{}".format(first, second, third))
print("{}{}{}".format(second, third, first))
print("{}{}{}".format(third, first, second))
print("{}{}{}".format(first[slice_conf], second[slice_conf], third[slice_conf]))
