A = float(input())
B = float(input())
C = float(input())

condition1 = B - C

if condition1 < 0:
    condition1 *= -1

condition2 = A
condition3 = B + C

if condition1 < condition2 < condition3:
    perimeter = A+B+C
    print("Perimetro = {:.1f}".format(perimeter))
else:
    area = (( A + B ) * C) / 2
    print("Area = {:.1f}".format(area))
