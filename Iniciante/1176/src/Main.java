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
		int vetor[] = new int[60];

		int n = sc.nextInt();
		int loop = 0;

		

		do {
			int l = sc.nextInt();
			
			for (int i = 0; i <= l; i++) {
				if (i == 0) {
					vetor[i] = 0;
				}
				if (i == 1) {
					vetor[i] = 1;
				}

				if (i == 2) {
					vetor[i] = 1;
				}
				if (i >= 3) {
					vetor[i] = vetor[i - 2] + vetor[i - 1];
				}

			}
			
			System.out.println("Fib("+l+") = "+vetor[l]);
			
			
		} while (loop < n);

		sc.close();
	}
}
