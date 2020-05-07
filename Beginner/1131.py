k: bool = True
countGremio: int = 0
countEmpate: int = 0
countInter: int = 0
countJogos: int = 0

while k:
    golInter = int(input())
    golGremio = int(input())
    if golGremio > golInter:
        countGremio += 1
    if golInter == golGremio:
        countEmpate += 1
    if golInter > golGremio:
        countInter += 1

    print('Novo grenal (1 - Sim & 2 - Não):')
    choose = int(input())
    if choose == 2:
        k = False
    countJogos += 1

print('{} grenais'.format(countJogos))
print('Inter: {}'.format(countInter))
print('Grêmio: {}'.format(countGremio))
print('Empate: {}'.format(countEmpate))

if countInter > countGremio:
    print("Inter venceu mais")
elif countGremio > countInter:
    print("Gremio venceu mais")
else:
    print("Nao houve vencedor")
