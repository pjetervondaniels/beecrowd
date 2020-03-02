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
		int contador=0,contador_i=0,contador_p=0,contador_n=0;
		
		a=sc.nextInt();
		if(a%2==0) {
			contador++;
		}
		if(a%2!=0) {
			contador_i++;
		}
		if(a>0) {
			contador_p++;
		}
		if(a<0) {
			contador_n++;
		}
		
		b=sc.nextInt();
		if(b%2==0) {
			contador++;
		}
		
		if(b%2!=0) {
			contador_i++;
		}
		if(b>0) {
			contador_p++;
		}
		if(b<0) {
			contador_n++;
		}
		
		c=sc.nextInt();
		if(c%2==0) {
			contador++;
		}
		
		if(c%2!=0) {
			contador_i++;
		}
		if(c>0) {
			contador_p++;
		}
		if(c<0) {
			contador_n++;
		}
		
		d=sc.nextInt();
		if(d%2==0) {
			contador++;
		
		}
		if(d%2!=0) {
			contador_i++;
		}
		if(d>0) {
			contador_p++;
		}
		if(d<0) {
			contador_n++;
		}
		
		e=sc.nextInt();
		if(e%2==0) {
			contador++;
		}
		if(e%2!=0) {
			contador_i++;
		}
		if(e>0) {
			contador_p++;
		}
		if(e<0) {
			contador_n++;
		}
		
		System.out.println(contador+" valor(es) par(es)");
		System.out.println(contador_i+" valor(es) impar(es)");
		System.out.println(contador_p+" valor(es) positivo(s)");
		System.out.println(contador_n+" valor(es) negativo(s)");
		
		sc.close();
	}

}