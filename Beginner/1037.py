value = float(input())

if 0 <= value <= 25.0000:
    print("Intervalo [0,25] ")
elif 25.0001 <= value <= 50.0000:
    print("Intervalo (25,50]")
elif 50.0001 <= value <= 75.0000:
    print("Intervalo (50,75]")
elif 75.0001 <= value <= 100.000:
    print("Intervalo (75,100]")
elif value < 0 or value > 100:
    print("Fora de intervalo")