x = int(input())
y = int(input())

while x != 0 and y != 0:

    if x > 0 and y > 0:
        print("primeiro")
    elif x < 0 and y > 0:
        print("segundo")
    elif x < 0 and y < 0:
        print("terceiro")
    elif x > 0 and y < 0:
        print("quarto")

    x = int(input())
    y = int(input())