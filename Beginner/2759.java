package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class uri2759 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char a,b,c;
		a = sc.next().charAt(0);
		b = sc.next().charAt(0);
		c = sc.next().charAt(0);
		
		System.out.println("A = "+a+", B = "+b+", C = "+c);
		System.out.println("A = "+b+", B = "+c+", C = "+a);
		System.out.println("A = "+c+", B = "+a+", C = "+b);
		System.out.println("\n");
		
		sc.close();
	}

}
