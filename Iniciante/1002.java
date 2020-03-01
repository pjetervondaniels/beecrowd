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
		double raio = sc.nextDouble();
		double PI = 3.14159;
		double A = Math.pow(raio, 2)*PI;
		System.out.println("A="+String.format("%.3f",A));
		sc.close();
	}

}
