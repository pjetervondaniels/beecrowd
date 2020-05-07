n: int = 0
quantityAlcool: int = 0
quantityGasolina: int = 0
quantityDiesel: int = 0

while n != 4:
    n = int(input())
    if n == 1:
        quantityAlcool += 1
    elif n == 2:
        quantityGasolina += 1
    elif n == 3:
        quantityDiesel += 1

print('Muito Obrigado')
print('Alcool: {}'.format(quantityAlcool))
print('Gasolina: {}'.format(quantityGasolina))
print('Diesel: {}'.format(quantityDiesel))

