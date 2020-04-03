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

		int n = 0, count = 0,k =0 ,g=0;
		float nota = 0, maior = 0;

		n = sc.nextInt();

		do {
			
			k = sc.nextInt();
			nota = sc.nextFloat();

			if (nota > maior) {
				g=k;
				maior = nota;
			}
			count++;

		} while (count < n);
		
		if (maior >= 8) {
			System.out.println(g);
		}else
			System.out.println("Minimum note not reached ");


		sc.close();
	}

}