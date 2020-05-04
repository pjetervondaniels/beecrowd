initialDay = int(input())
initialHour = int(input())
initialMinute = int(input())
initialSecond = int(input())

print("Dia {}".format(initialDay))
print("{}:{}:{}".format(initialHour, initialMinute, initialSecond))

finalDay = int(input())
finalHour = int(input())
finalMinute = int(input())
finalSecond = int(input())

print("Dia {}".format(finalDay))
print("{}:{}:{}".format(finalHour, finalMinute, finalSecond))

if initialSecond > finalSecond:
    finalSecond +=60

countSecond: int = 0

for i in range(initialSecond, finalSecond, 1):
    countSecond +=1

countMinute: int = 0

while countSecond >= 60:
    countMinute += 1
    countSecond -= 60

if initialMinute > finalMinute:
    finalMinute += 60

for i in range(initialMinute, finalMinute, 1):
    countMinute += 1

countHour: int = 0

while countMinute >= 60 :
    countHour += 1
    countMinute -= 60

if initialHour > finalHour:
    finalHour += 24

for i in range(initialHour, finalHour, 1):
    countHour += 1

countDay: int = 0

while countHour >= 24:
    countDay += 1
    countHour -= 24

if initialDay > finalDay:
    finalDay += 30

for i in range(initialDay, finalDay, 1):
    countDay += 1

print("{} dia(s)".format(countDay))
print("{} hora(s)".format(countHour))
print("{} minuto(s)".format(countMinute))
print("{} segundo(s)".format(countSecond))
