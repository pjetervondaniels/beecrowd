salary = float(input())

if salary <= 2000.00 :
    print("Isento")
else:
    tax = salary - 2000
    if tax >= 0.01:
        if tax <= 1000:
            tribute = tax * 0.08
            tax = 0
        else:
            tribute = 1000 * 0.8
            tax -= 1000
    if tax >= 0.01:
        if tax <= 1500:
            tribute += (tax * 0.18)
            tax = 0
        else:
            tribute += (1500 * 0.18)
            tax = tax - 1500
    if tax >= 0.01:
        tribute += (tax * 0.28)

    print("R${:.2f}".format(tribute))
