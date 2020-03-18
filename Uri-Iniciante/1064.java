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
		double a,b,c,d,e,f,m1=0,m2=0,m3=0,m4=0,m5=0,m6=0;
		int contador=0;
		
		a=sc.nextDouble();
		if(a>0) {
			contador++;
			m1=a;
		}
		b=sc.nextDouble();
		if(b>0) {
			contador++;
			m2=b;
		}
		c=sc.nextDouble();
		if(c>0) {
			contador++;
			m3=c;
		}
		d=sc.nextDouble();
		if(d>0) {
			contador++;
			m4=d;
		}
		e=sc.nextDouble();
		if(e>0) {
			contador++;
			m5=e;
		}
		f=sc.nextDouble();
		if(f>0) {
			contador++;
			m6=f;
		}
		
		System.out.println(contador+" valores positivos");
		double mean = (m1+m2+m3+m4+m5+m6)/contador;
		System.out.println(String.format("%.1f", mean));
		sc.close();
	}

}