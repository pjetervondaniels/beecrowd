
i = 1
j = 7
begin = 7

while i <= 9 and j <= 15:
    print("I = {} J = {}".format(i, j))
    j -= 1
    if j == begin - 2:
        print("I = {} J = {}".format(i, j))
        i += 2
        j = begin + 2
        begin += 2
