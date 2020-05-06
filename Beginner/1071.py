numberX = int(input())
numberY = int(input())
count: int = 0

if numberX < 0:
    count -= numberX

for i in range(numberX,numberY,1):
    if i % 2 != 0:
        count += i
else:
    print(count)