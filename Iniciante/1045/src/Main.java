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
		double A, B, C, menor=0, meio=0,maior=0;
		// ordenamento
		A= sc.nextDouble();
		B= sc.nextDouble();
		C=sc.nextDouble();
		
		// menor
		if (A < B && A < C) {
			menor = A;
		}
		if (B < A && B < C) {
			menor = B;
		}
		if (C < B && C < B) {
			menor = C;
		}

		// meio
		if (A > B && A < C) {
			meio = A;
		}
		if (A > C && A < B) {
			meio = A;
		}

		if (B > A && B < C) {
			meio = B;
		}
		if (B > C && B < A) {
			meio = B;
		}

		if (C > A && C < B) {
			meio = C;
		}
		if (C > B && C < A) {
			meio = C;
		}

		// maior

		if (A > B && A > C) {
			maior=A;
		}
		if (B > A && B > C) {
			maior=B;
		}
		if (C > A && C > B) {
			maior=C;
		}
		
		//iguais e maiores
		if(A==B && B>C) {
			meio=A;
			maior=B;
		}
		if(A==C && C>B) {
			meio=A;
			maior=C;
		}
		if(B==C && B>A) {
			meio=A;
			maior=C;
		}
		
		// iguais e menores
		if(A==B && B<C) {
			meio=A;
			menor=B;
		}
		if(A==C && C<B) {
			meio=A;
			menor=C;
		}
		if(B==C && B<A) {
			meio=A;
			menor=C;
		}
		// todos iguais
		if(A==B && B==C) {
			meio=A;
			menor=B;
			maior=C;
		}
			
		A=maior;
		B=meio;
		C=menor;
		
		if(A>=B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else{
			if(Math.pow(A, 2)==Math.pow(B,2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(A, 2)>Math.pow(B,2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(A, 2)<Math.pow(B,2)+Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(A==B && B==C && A==C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if(A==B && B!=C || C==A && B!=A || C==B && C!=A) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();
	}

}