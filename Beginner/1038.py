
quantity = int(input())
orderType = int(input())

if orderType == 1:
    valueRequest = 4.00*quantity
elif orderType == 2:
    valueRequest = 4.50 * quantity
elif orderType == 3:
    valueRequest = 5.00 * quantity
elif orderType == 4:
    valueRequest = 2 * quantity
elif orderType == 5:
    valueRequest = 1.50 * quantity
else:
    valueRequest = 0
    
print("TOTAL: R${:.2f}".format(valueRequest))