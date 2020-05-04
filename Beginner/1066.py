countEven: int = 0
countOdd: int = 0
countPositive: int = 0
countNegative: int = 0

for i in range(6):
    n = int(input())

    if n > 0:
        countPositive += 1
    else:
        countNegative += 1

    if n % 2 == 0:
        countEven += 1
    else:
        countOdd += 1
else:
    print("{} valor(es) impar(es)".format(countOdd))
    print("{} valor(es) par(es)".format(countEven))
    print("{} valor(es) positivo(s)".format(countPositive))
    print("{} valor(es) negativo(s)".format(countNegative))