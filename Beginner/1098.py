
i = 0
j = 1

count = 0
rodada = 0

while i <= 2:
    print("I = {:.1f} J = {:.1f}".format(i, j))
    j += 1 + i - i

    if count > 2 and rodada > 3:
        i += 0.2;
        j = 1 + i;
        count = 0;

    if count == 2 and rodada < 3:
        i += 0.2;
        j = 1 + i;
        count = 0;

    count += 1
    rodada += 1


