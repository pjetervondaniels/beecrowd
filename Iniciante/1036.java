import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double A,B,C,delta;
		
		A=sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		
		delta = Math.pow(B,2)-(4*A*C);
		if(delta<=0) {
			System.out.println("Impossivel calcular");
		}else{
			double R1,R2;
			R1=(-B+(Math.sqrt(delta)))/(2*A);
			R2=(-B-(Math.sqrt(delta)))/(2*A);
			System.out.println("R1 = "+String.format("%.5f",R1));
			System.out.println("R2 = "+String.format("%.5f",R2));
		}
		sc.close();
	}

}