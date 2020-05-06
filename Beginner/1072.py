
numberCases = int(input())

countIn: int = 0
countOut: int = 0

for i in range (0, numberCases, 1):
    n = int(input())
    if 10 <= n <= 20:
        countIn += 1
    else:
        countOut += 1
else:
    print("{} in".format(countIn))
    print("{} out".format(countOut))
