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
		
		double n = sc.nextDouble();
		double sqrt = Math.sqrt(5);
		double pos = 1+sqrt;
		double neg = 1-sqrt;
		
		double binet = ((Math.pow(pos/2,n))-(Math.pow(neg/2,n)))/sqrt;
		
		System.out.println(String.format("%.1f", binet));
		
		
		sc.close();
	}

}