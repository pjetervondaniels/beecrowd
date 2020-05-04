
A = int(input())
B = int(input())
C = int(input())
D = int(input())

if B > C and D >A and C+D > A+B and C >= 0 and D >= 0 and A % 2 == 0:
    print("Valores Aceitos")
else:
    print("Valores não aceitos")