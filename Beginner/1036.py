import math

A = float(input())
B = float(input())
C = float(input())
delta = math.pow(B, 2) - (4 * A * C)
if delta <= 0:
    print("Impossível de calcular..")
else:
    R1 = (-B + (math.sqrt(delta))) / (2 * A)
    R2 = (-B - (math.sqrt(delta))) / (2 * A)
    print("R1 = {:.5f}".format(R1))
    print("R2 = {:.5f}".format(R2))