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
		int a,b,c,d,e,f;
		int contador=0;
		
		a=sc.nextInt();
		if(a%2==0) {
			contador++;
		}
		b=sc.nextInt();
		if(b%2==0) {
			contador++;
		}
		c=sc.nextInt();
		if(c%2==0) {
			contador++;
		}
		d=sc.nextInt();
		if(d%2==0) {
			contador++;
		
		}
		e=sc.nextInt();
		if(e%2==0) {
			contador++;
		}
		
		
		System.out.println(contador+" valores pares");

		sc.close();
	}

}