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
		double a,b,c,d,e,f;
		int contador=0;
		
		a=sc.nextDouble();
		if(a>0) {
			contador++;
		}
		b=sc.nextDouble();
		if(b>0) {
			contador++;
		}
		c=sc.nextDouble();
		if(c>0) {
			contador++;
		}
		d=sc.nextDouble();
		if(d>0) {
			contador++;
		}
		e=sc.nextDouble();
		if(e>0) {
			contador++;
		}
		f=sc.nextDouble();
		if(f>0) {
			contador++;
		}
		
		System.out.println(contador+" valores positivos");
		
		sc.close();
	}

}