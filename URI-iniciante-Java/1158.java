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
		int count = 0;
		int l = 0;

		int n = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();

		for (int j = x; l < y; j++) {
			if (j % 2 != 0) {
				count += j;
			}
		}
		System.out.println(count);

		sc.close();
	}

}