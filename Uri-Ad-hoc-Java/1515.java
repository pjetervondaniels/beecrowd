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
		int n = 0, count = 0, menor = 0;

		do {
			n = sc.nextInt();

			String vetor[] = new String[n];
			int v_int[] = new int[n];

			while (count < n) {
				String quebra_linha = sc.nextLine();
				vetor[count] = sc.nextLine();
				int ano = sc.nextInt();
				int tempo = sc.nextInt();
				v_int[count] = ano - tempo;
				if (count == 0) {
					menor = v_int[0];
				}
				
				count++;
			}
			
			for (int i = 0; i < n; i++) {
				if (menor > v_int[i]) {
					menor = v_int[i];
				}
			}
			
			for (int j = 0; j < n; j++) {
				if (menor == v_int[j]) {
					System.out.println(vetor[j]);
				}
			}
			count=0;
		} while (n != 0);

		sc.close();
	}

}