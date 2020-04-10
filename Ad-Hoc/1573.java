package uri1573;

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
		int a=1,b=2,c=3,r=0;
		
		while(a!=0 && b!=0 && c!=0) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			r = (2*a*b)+(2*a*c)+(2*b*c);
			r = (int) Math.sqrt((r/6));
			System.out.println(r);
		}
		sc.close();
	}

}