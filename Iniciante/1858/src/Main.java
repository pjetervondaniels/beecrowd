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
		int n = sc.nextInt();
		int min = 21, r = 0, x, i;

		for (i = 1; i <= n; i++) {
			x = sc.nextInt();
			if(min > x) {
				min = x;
				r = i;
			}
		}

		System.out.println(r);
		sc.close();
	}
}