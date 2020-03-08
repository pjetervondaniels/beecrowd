import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		while ((linha = br.readLine()) != null) {

			int n = Integer.parseInt(linha);
			int i = 0, vote = 0, k = 0;
			double calculus = ((2*n)/3);
			System.out.println(calculus);
			while (i < n) {
				vote = sc.nextInt();
				if (vote == 1) {
					k = k+1;
				}
				i++;
			}
			if (k > calculus) {
				System.out.println("impeachment");
			}
			if (calculus >= k) {
				System.out.println("acusacao arquivada");
			}
		}
		
		sc.close();
	}

}