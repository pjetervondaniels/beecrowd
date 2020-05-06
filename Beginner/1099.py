n = int(input())

for i in range(0, n, 1):
    x = int(input())
    y = int(input())
    count: int = 0
    if x > y:
        temp = x
        x = y
        y = temp
    for j in range(x+1,y,1):
        if j % 2 == 0:
            count += j

else:
    print(count)

