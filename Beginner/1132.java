
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x, y, count = 0;

		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y > x) {
			for (int i = x; i <= y; i++) {
				if (i % 13 != 0) {
					count += i;
				}
			}
		}

		if (x > y) {
			for (int i = y; i <= x; i++) {
				if (i % 13 != 0) {
					count += i;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}

}