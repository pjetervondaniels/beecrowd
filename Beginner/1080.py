
vet = []
large: int = 0
position: int = 0

for i in range(0, 10, 1):
    n = int(input())
    vet.append(n)
    if i == 0:
        large = vet[i]
    if vet[i] > large:
        large = vet[i]
        position = i + 1
else:
    print(large)
    print(position)