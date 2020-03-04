
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
		int cont = 0;
		int n = 0;
		int k=0;
		while (cont < 3) {
			String sonho = sc.nextLine();
			char vetor[] = new char[7];
			
			for (int i = 0; i < sonho.length(); i++) {
				vetor[i] = sonho.charAt(i);
			}
			
			if (vetor[0] == 'c' && k==1) {
				n = 0;
				cont++;
			}
			
			
			if (vetor[0] == 'c') {
				System.out.println(n);
				n = 0;
				k++;
				cont++;
			}
			
			if (vetor[0] == '-' && vetor[1] == '-' && vetor[2] == '*') {
				n = n + 1;
				k=0;
			}
			if (vetor[0] == '-' && vetor[1] == '*' && vetor[2] == '-') {
				n = n + 2;
				k=0;
			}
			if (vetor[0] == '-' && vetor[1] == '*' && vetor[2] == '*') {
				n = n + 3;
				k=0;
			}
			
			if (vetor[0] == '*' && vetor[1] == '-' && vetor[2] == '-') {
				n = n + 4;
				k=0;
			}
			if (vetor[0] == '*' && vetor[1] == '-' && vetor[2] == '*') {
				n = n + 5;
				k=0;
			}
			
			if (vetor[0] == '*' && vetor[1] == '*' && vetor[2] == '*') {
				n = n + 7;
				k=0;
			}
			if (vetor[0] == '*' && vetor[1] == '*' && vetor[2] == '-') {
				n = n + 6;
				k=0;
			}

		}

		sc.close();
	}

}
