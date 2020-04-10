package Uri1548;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numeroCasos = sc.nextInt();
		int i = 0, k = 0, j;

		while (numeroCasos < i) {

			int M = sc.nextInt();
			int vetor[] = new int[M];

			while (M < k) {
				vetor[i] = sc.nextInt();
				k++;
			}
			System.out.println(ordenaVetor(vetor));
			i++;

		}

		sc.close();
	}

	public static int ordenaVetor(int vetor[]) {
		int ordenacao = 0, aux;
		int maior = 0, menor = vetor[1];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
					ordenacao++;
				}
			}
		}

		return ordenacao;
	}

}