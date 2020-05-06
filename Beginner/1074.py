
numberCases = int(input())

for i in range(0, numberCases, 1):
    n = int(input())
    if n < 0 and n % 2 == 0:
        print("EVEN NEGATIVE")
    elif n > 0 and n % 2 == 0:
        print("EVEN POSITIVE")
    elif n < 0 and n % 2 != 0:
        print("ODD NEGATIVE")
    elif n > 0 and n % 2 != 0:
        print("ODD POSITIVE")
    elif n == 0:
        print("NULL")