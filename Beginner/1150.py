
y: int = 0
count: int = 0
n: bool = True

x = int(input())

while n:
    y = int(input())
    if x < y:
        n = False

soma = x
k = x + 1

while soma <= y:
    soma += k
    count += 1
    k += 1

print(soma)