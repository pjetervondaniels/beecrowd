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
		
		int A=0,B=0,C=0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(Math.abs(B-C)<A && A<B+C) {
			if(A!=B && B!=C && A!=C) {
				System.out.println("Valido-Escaleno");
			}
			if(A==B && B!=C || B==C && B!=A || C==A && C!=B) {
				System.out.println("Valido-Isoceles");
			}
			if(A==B && B==C) {
				System.out.println("Valido-Equilatero");
			}
			if(A*A==B*B+C*C || B*B==A*A+C*C || C*C==A*A+B*B) {
				System.out.println("Retangulo: S");
			}
			if(A*A!=B*B+C*C && B*B!=A*A+C*C && C*C!=A*A+B*B) {
				System.out.println("Retangulo: N");
			}
		}
		if(Math.abs(B-C)>A && A>=B+C) {
			System.out.println("Invalido");
		}
		
		
		
		sc.close();
	}

}