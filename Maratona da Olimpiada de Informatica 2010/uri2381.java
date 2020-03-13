package OBI2010;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class uri2381 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		String vetor[] = new String [n+1];
		int escolhido = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1 ; i < n;i++) {
			vetor[i] = sc.nextLine();
		}

		Arrays.sort(vetor);
		System.out.println(vetor[escolhido]);
		
		sc.close();
	}
}