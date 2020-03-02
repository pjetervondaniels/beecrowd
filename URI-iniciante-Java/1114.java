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
		int x, y;
		do {

			x = sc.nextInt();
			y = sc.nextInt();

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
		} while (x != 0 && y != 0);

		sc.close();
	}

}