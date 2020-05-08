
N = 0
a = 0
soma = 0

while N <= 0:
    N = int(input())

while a <= 0:
    a = int(input())

for i in range(1,N-1,1):
    soma += i + a

print(soma)