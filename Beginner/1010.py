
numberPiece1 = int(input())
quantity1 = int(input())
price1 = float(input())

numberPiece2 = int(input())
quantity2 = int(input())
price2 = float(input())

totalCost = (quantity1*price1)+(quantity2*price2)

print("VALOR A PAGAR: R${:.2f}".format(totalCost))
