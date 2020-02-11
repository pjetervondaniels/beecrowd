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
		
		double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double condicao1 = Math.abs(B-C);
		double condicao2=A;
		double condicao3=B+C;
		double area=0;
		double perimetro =0;
		 
		if(condicao1<condicao2 && condicao2<condicao3) {
			perimetro = A+B+C;
			System.out.println("Perimetro = "+String.format("%.1f", perimetro));
		}else {
			area = ((A+B)*C)/2;
			System.out.println("Area = "+String.format("%.1f", area));
		}	
		sc.close();
	}

}