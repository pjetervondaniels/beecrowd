import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double A,B,C,pi;
		
		pi=3.14159;
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		
		System.out.println("TRIANGULO: "+String.format("%.3f", (A*C)/2));
		System.out.println("CIRCULO: "+String.format("%.3f", pi*(C*C))) ;
		System.out.println("TRAPEZIO: "+String.format("%.3f", ((A+B)*C)/2));
		System.out.println("QUADRADO: "+String.format("%.3f", (B*B)));
		System.out.println("RETANGULO: "+String.format("%.3f", A*B));
		
		sc.close();
	}

}