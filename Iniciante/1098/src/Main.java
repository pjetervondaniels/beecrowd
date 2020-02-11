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
		double i = 0, j = 1;
		int count = 0;
		int rodada = 0;
		do {
			System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j));
			j += 1 + i - i;
			if (count > 2 && rodada > 3) {
				i += 0.2;
				j = 1 + i;
				count = 0;
			}
			
			if (count == 2 && rodada < 3) {
				i += 0.2;
				j = 1 + i;
				count = 0;
			}
			
			count++;
			rodada++;
			
		} while (i <= 2);

		sc.close();
	}
}