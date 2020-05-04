import math

A = int(input())
B = int(input())
C = int(input())

abs = A-B

if abs < 0:
    abs *= -1
else:
    abs *= 1

bigger = ((A + B) + abs) / 2;

if bigger > C:
    print("{} eh o maior".format(bigger))
else:
    print("{} eh o maior".format(C))
