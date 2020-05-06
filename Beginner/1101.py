x = int(input())
y = int(input())

while x > 0 and y > 0:
    sum = 0
    if x > y:
        for i in range(y, x+1, 1):
            sum += i
            print("{} ".format(i))
        else:
            print("SUM = {}".format(sum))
    else:
        for i in range(x, y+1, 1):
            print("{}".format(i))
            sum += i
        else:
            print("SUM = {}".format(sum))

    x = int(input())
    y = int(input())


