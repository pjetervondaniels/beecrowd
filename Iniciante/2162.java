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
		int n, i, conta = 1;
		n = sc.nextInt();
		int vetor[] = new int[n];

		for (i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
			if (n == 2 && vetor[0] == vetor[1]) {
				conta = 0;
			}else{
				for (i = 2; i < n; i++) {
					if (vetor[i] >= vetor[i - 1] && vetor[i - 1] >= vetor[i - 2]) {
						conta = 0;
						break;
					} else if (vetor[i] <= vetor[i - 1] && vetor[i - 1] <= vetor[i - 2]) {
						conta = 0;
						break;
					}
				}
			}
		}

		if (conta == 1) {
			System.out.println("1");
		}
		if (conta != 1) {
			System.out.println("0");
		}

		sc.close();
	}

}