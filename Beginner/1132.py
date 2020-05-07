count: int = 0

x = int(input())
y = int(input())

if y > x:
    for i in range(x, y+1, 1):
        if i % 13 != 0:
            count += i

if x > y:
    for i in range(y, x+1, 1):
        if i % 13 != 0:
            count += i

print('{}'.format(count))
