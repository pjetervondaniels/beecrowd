import math

x1 = float(input())
y1 = float(input())
x2 = float(input())
y2 = float(input())

distance = math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)))

print("{:.4f}".format(distance))