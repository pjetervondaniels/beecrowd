package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri2758 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		System.out.printf("A = %f, B = %f\n", a, b); // 7
		System.out.printf("C = %lf, D = %.lf\n", c, d); // 8
		System.out.printf("A = %.1f, B = %.1f\n", a, b); // 9
		System.out.printf("C = %.1lf, D = %.1lf\n", c, d); // 10
		System.out.printf("A = %.2f, B = %.2f\n", a, b); // 11
		System.out.printf("C = %.2lf, D = %.2lf\n", c, d); // 12
		System.out.printf("A = %.3f, B = %.3f\n", a, b); // 13
		System.out.printf("C = %.3lf, D = %.3lf\n", c, d); // 14
		System.out.printf("A = %.3E, B = %.3E\n", a, b); // 15
		System.out.printf("C = %.3E, D = %.3E\n", c, d); // 16
		System.out.printf("A = %.0f, B = %.0f\n", a, b); // 17
		System.out.printf("C = %.0lf, D = %.0lf\n", c, d); // 18
		
		sc.close();
	}
}