count: int = 0

for i in range(6):
    n = int(input())
    if n % 2 == 0:
        count += 1
else:
    print("{} valores pares".format(count))