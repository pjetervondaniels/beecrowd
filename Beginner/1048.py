salary = float(input())

if 0 < salary <= 400.00:
    reajust = 15
    percentual = salary * (reajust / 100)
    newSalary = salary + percentual

elif 400.01 <= salary <= 800.00:
    reajust = 12
    percentual = salary * (reajust / 100)
    newSalary = salary + percentual

elif 800.01 <= salary <= 1200.00:
    reajust = 10
    percentual = salary * (reajust / 100)
    newSalary = salary + percentual

elif 1200.01 <= salary <= 2000.00:
    reajust = 7
    percentual = salary * (reajust / 100)
    newSalary = salary + percentual

elif salary > 2000.00:
    reajust = 4
    percentual = salary * (reajust / 100)
    newSalary = salary + percentual

print("Novo salário: {:.2f}".format(newSalary))
print("Reajuste ganho: {:.2f}".format(percentual))
print("Em percentual: {:.0f}%".format(reajust))
