n = -1

while n < 0  or  n > 46 :
    n = int(input())

i = 0
count = 0
ant = 0

while count != n:
    print(i)
    if i == 0:
        i += 1
    if i == 1 and count == 1:
        i += 1
    if i == 1 and count == 2:
        ant = i
        i += i
    if count >= 3:
        i += ant
        ant = i

    count += 1