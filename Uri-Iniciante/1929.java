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
		int a,b,c,d;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		
		if(Math.abs(b-c)<a && a<b+c ||  Math.abs(a-c)< b && b < a + c ||  Math.abs(a-b)< c && c < a + b || Math.abs(b-d)<a && a<b+d ||  Math.abs(a-d)< b && b < a + d ||  Math.abs(a-b)< d && d < a + b ||
			Math.abs(d-c)<a && a<d+c ||  Math.abs(d-c)< b && b < d + c ||  Math.abs(a-b)< d && d < a + b ) {
			System.out.println("S");
		}else{
			System.out.println("N");
		}
		
		
		
		sc.close();
	}

}