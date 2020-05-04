number = int(input())
count: int = 0
i: int = number

while count < 6:
    if i % 2 != 0:
        print(i)
        count += 1
    i += 1
