N1 = float(input())
N2 = float(input())
N3 = float(input())
N4 = float(input())

mean = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10

if mean < 5.0:
    print("Media: {:.1f}".format(mean))
    print("Aluno Reprovado.")

elif 5.0 <= mean <= 6.9:
    print("Media: {:.1f}".format(mean))
    print("Aluno em Exame.")
    print("nota do exame:")

    exam2 = float(input())
    mean2 = (mean+exam2)/2

    if mean2 >= 5.0:
        print("Aluno Aprovado.")
        print("Media Final: {:.1f}".format(mean))
    else:
        print("Aluno Reprovado.")
        print("Media Final: {:.1f}".format(mean))

elif mean >= 7.0:
    print("Media: {:.1f}".format(mean))
    print("Aluno Aprovado.")