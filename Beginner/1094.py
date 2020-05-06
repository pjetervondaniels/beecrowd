n = int(input())

quantityRabbits: int = 0
quantityMouses: int = 0
quantityFrogs: int = 0

for i in range(0, n, 1):
    quantity = int(input())
    type = input()
    if type == 'C' or type == 'c':
        quantityRabbits += quantity
    elif type == 'R' or type == 'r':
        quantityMouses += quantity
    elif type == 'S' or type == 's':
        quantityFrogs += quantity
else:
    total = quantityFrogs + quantityMouses + quantityRabbits

    percentFrogs: float = (quantityFrogs * 100)/ total
    percentMouses: float = (quantityMouses * 100)/ total
    percentRabbits: float = (quantityRabbits * 100) / total

    print("Total: {} cobaias".format(total))
    print("Total de coelhos: {}".format(quantityRabbits))
    print("Total de ratos: {}".format(quantityMouses))
    print("Total de sapos: {}".format(quantityFrogs))
    print("Percentual de coelho: {:.2f} %".format(percentRabbits))
    print("Percentual de ratos: {:.2f} %".format(percentMouses))
    print("Percentual de sapos: {:.2f} %".format(percentFrogs))

