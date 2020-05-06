
i = 1
j = 7

while i <= 9 and j != 5:
    print('I = {} J = {}'.format(i, j))
    j -= 1
    if j == 5:
        print('I = {} J = {}'.format(i, j))
        i += 2
        j = 7

