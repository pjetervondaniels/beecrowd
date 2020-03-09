package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri2751 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Valores de b:");
		System.out.println("-------------");
		System.out.println("1) b = 7");
		System.out.println("2) b =                    7");
		System.out.println("3) b = 00000000000000000007");
		System.out.println("4) b = 7                   ");
		System.out.println("5) b = 7%\n");
		System.out.println("Valores de d:");
		System.out.println("-------------");
		System.out.println("1) d = 2.208000");
		System.out.println("2) d = 2");
		System.out.println("3) d = 2.2");
		System.out.println("4) d = 2.21");
		System.out.println("5) d = 2.208");
		System.out.println("6) d =                2.208");
		System.out.println("7) d = 0000000000000002.208");
		System.out.println("8) d = 2.208               ");
		System.out.println("9) d = 2.21%");
		
		sc.close();
	}

}
