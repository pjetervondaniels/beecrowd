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
		double n, ans1, ans2;
		    n = sc.nextDouble();
		    
		    ans1 = n/Math.log(n);
		    ans2 = (1.25506)*(n/Math.log(n));
		    System.out.println(String.format("%.1f", ans1)+" "+String.format("%.1f", ans2));
		   
		sc.close();
	}

}