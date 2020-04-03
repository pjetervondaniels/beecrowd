import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		while ((linha = br.readLine()) != null) {
			int n = sc.nextInt();
			int vetor[] = new int[n];
			int i = 0;
			while (i < n) {
				vetor[i] = sc.nextInt();
				vetor[i]-=1;
				i++;
			}
			i = 0;
			while (i < n) {
				System.out.printf("%c", linha.charAt(vetor[i]));
				i++;
			}
		}
		sc.close();
	}

}