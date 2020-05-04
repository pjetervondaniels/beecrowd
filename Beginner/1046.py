
initialHour = int(input())
finalHour = int(input())

if finalHour <= initialHour:
    finalHour += 24

i: int = initialHour
count: int = 0

while i < finalHour:
    count += 1
    i += 1
else:
    print("O JOGO DUROU {} HORA(S)".format(count))
