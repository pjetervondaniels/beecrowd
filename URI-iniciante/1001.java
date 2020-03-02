package uri;

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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma = a+b;
		System.out.println(soma);
		sc.close();
	}

}