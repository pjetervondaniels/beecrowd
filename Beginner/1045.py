import math

A = float(input())
B = float(input())
C = float(input())


if A < B and  A < C :
    smaller = A
elif B < A and  B < C:
    smaller = B
elif C < A and C < B :
    smaller = C

if B < A < C:
    middle = A
elif C < A < B:
    middle = A
elif A < B < C:
    middle = B
elif C < B < A:
    middle = B;
elif A < C < B:
    middle = C
elif B < C < A:
    middle = C

if A > B and A > C:
    larger = A
elif B > A and B > C:
    larger = B
elif C > A and C > B:
    larger = C

if A == B and B > C:
    middle=A
    larger=B
elif A == C and C > B:
    middle=A
    larger=C
elif A == C and C > B:
    middle=A
    larger=C


if A == B and B < C:
    middle = A
    smaller = B

if A == C and C < B:
    middle = A
    smaller = C

if C == B and B < A:
    middle = C
    smaller = B

if A == B == C:
    smaller = A
    middle = B
    larger = C

A = smaller
B = middle
C = larger

if A >= B + C:
    print("NAO FORMA TRIANGULO")

if math.pow(A, 2) == math.pow(B, 2)+math.pow(C, 2):
    print("TRIANGULO RETANGULO")
elif math.pow(A, 2) > math.pow(B, 2)+math.pow(C, 2):
    print("TRIANGULO OBTUSANGULO")
elif math.pow(A, 2) < math.pow(B, 2)+math.pow(C, 2):
    print("TRIANGULO ACUTANGULO")

if A == B == C:
    print("TRIANGULO EQUILATERO")
elif A == B and B != C or C == A and B != A or C == B and C != A:
    print("TRIANGULO ISOSCELES")
