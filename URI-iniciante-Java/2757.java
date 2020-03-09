
package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri2757 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.printf("A = %d, B = %d, C = %d\n", a, b, c);
		System.out.printf("A = %10d, B = %10d, C = %10d\n", a, b, c);
		System.out.printf("A = %010d, B = %010d, C = %010d\n", a, b, c);
		System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", a, b, c);
		
		sc.close();
	}

}