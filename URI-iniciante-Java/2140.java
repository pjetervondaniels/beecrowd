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
		int N, M, resto, i, verificador;
		int troco[] = { 7, 12, 22, 52, 102, 15, 25, 55, 105, 30, 60, 110, 70, 120, 150 };

		N = sc.nextInt();
		M = sc.nextInt();

		while (N != 0 && M != 0) {
			resto = M - N;
			for (i = 0, verificador = 0; i < 15; i++) {
				if (troco[i] == resto) {
					verificador = 1;
					break;
				}
			}
			
			if(verificador==1) {
				System.out.println("possible");
			}
			if(verificador==0){
				System.out.println("impossible");
			}
			
			N = sc.nextInt();
			M = sc.nextInt();
		
		}

		sc.close();
	}

}