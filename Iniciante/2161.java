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
		double n, conta = 0.0;
		n = sc.nextDouble();

		while (n != 0) {
			conta += 6.0;
			conta = 1.0 / conta;
			n--;
			
		}

		conta += 3.0;

		System.out.println(String.format("%.10f", conta));
		sc.close();
	}

}

