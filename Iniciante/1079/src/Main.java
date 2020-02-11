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
		
		for(int i=0;i<n;i++) {
			double a,b,c,mean;
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			mean=((a*2)+(b*3)+(c*5))/10;
			System.out.println(String.format("%.1f", mean));
		}
		
		
		sc.close();
	}

}