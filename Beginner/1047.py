
initialHour = int(input())
initialMinute = int(input())

finalHour = int(input())
finalMinute = int(input())

if finalHour <= initialHour:
    finalHour += 24

i: int = initialHour
countHours: int = 0
countMinutes: int = 0

countMinutes = finalHour * 60 + finalMinute - (initialHour * 60 + initialMinute)

while countMinutes >= 60:
    countHours += 1
    countMinutes -= 60
else:
    print("O JOGO DUROU {} HORA(S) e {} MINUTO(S)".format(countHours,countMinutes))
