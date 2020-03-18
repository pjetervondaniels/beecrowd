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
		int teste, i=1, n = 1;
		teste = sc.nextInt();

		while (i<teste) {
			n = sc.nextInt();
			if (n % 2 != 0) {
				System.out.println(n * 2 - 1);
			} else {
				System.out.println(n * 2 - 2);
			}
			i++;
		}

		sc.close();
	}

}