count: int = 0
mean: float = 0

for i in range(6):
    n = int(input())
    if n > 0:
        mean += n
        count += 1
else:
    mean /= 6
    print("{} valores positivos".format(count))
    print("{:.1f}".format(mean))