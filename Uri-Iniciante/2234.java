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
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		System.out.println(String.format("%.2f", x/y));
		
		sc.close();
	}

}