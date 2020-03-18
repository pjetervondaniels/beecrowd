
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x, y;

		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y > x) {
			for (int i = x+1; i < y; i++) {
				if (i % 5 == 2 || i%5==3) {
					System.out.println(i);
				}
			}
		}

		if (x > y) {
			for (int i = y+1; i < x; i++) {
				if (i % 5 == 2 || i%5==3) {
					System.out.println(i);
				}
			}
		}


		sc.close();
	}

}