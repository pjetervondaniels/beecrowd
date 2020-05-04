
valor = float(input())

cem = int (valor / 100)
cinquenta = int ((valor - cem * 100) / 50)
vinte = int((valor - cem * 100 - cinquenta * 50) / 20)
dez = int ((valor - cem * 100 - cinquenta * 50 - vinte * 20) / 10)
cinco = int ((valor - cem * 100 - cinquenta * 50 - vinte * 20 - dez * 10) / 5)
dois = int ((valor - cem * 100 - cinquenta * 50 - vinte * 20 - dez * 10 - cinco * 5) / 2)
um = int ((valor - cem * 100 - cinquenta * 50 - vinte * 20 - dez * 10 - cinco * 5 - dois * 2) / 1)

print("{:.2f}".format(valor))
print("{} nota(s) de R$ 100,00".format(cem))
print("{} nota(s) de R$ 50,00".format(cinquenta))
print("{} nota(s) de R$ 20,00".format(vinte))
print("{} nota(s) de R$ 10,00".format(dez))
print("{} nota(s) de R$ 5,00".format(cinco))
print("{} nota(s) de R$ 2,00".format(dois))
print("{} nota(s) de R$ 1,00".format(um))