
count: int = 0

for i in range (0,6,1):
    n = int(input())
    if n > 0:
        count += 1
else:
    print("{} valores positivos".format(count))