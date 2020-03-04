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
		int i, S = 1;
		int C = 0;
		C = sc.nextInt();
		int k = 0;
		while (k < C) {
			int N = sc.nextInt();
			if (N % 2 == 0) {
				System.out.println(0);
			}
			if (N % 2 != 0) {
				System.out.println(1);
			}

			k++;
		}
		System.out.println(" ");
		sc.close();
	}

}