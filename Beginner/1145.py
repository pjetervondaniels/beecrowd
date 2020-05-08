x = int(input())
y = int(input())
count:int = 0

if x >y:
    for i in range(1, x+1, 1):
        if count <= 1:
            print('{}'.format(i))
            count += 1
        elif count == 2:
            print('{}'.format(i+1))
            i += 1

if y > x:
    for i in range(1, y+1, 1):
        if count <= 1:
            print('{}'.format(i))
            count += 1
        elif count == 2:
            print('{}'.format(i + 1))
            i += 1

