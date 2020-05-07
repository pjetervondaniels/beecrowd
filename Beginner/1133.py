x = int(input())
y = int(input())

if y > x:
    for i in range(x+1, y, 1):
        if i % 5 == 2 or i % 5 == 3:
            print(i)

if x > y:
    for i in range(y+1, x, 1):
        if i % 5 == 2 or i % 5 == 3:
            print(i)
