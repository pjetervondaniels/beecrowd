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

		int[] vector = new int[100];
		int maior = 0;
		int posicao = 0;

		for (int i = 0; i < 100; i++) {
			vector[i] = sc.nextInt();
			if (vector[i] > maior) {
				maior = vector[i];
				posicao=i+1;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);
		sc.close();
	}

}