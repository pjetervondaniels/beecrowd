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
		int n = sc.nextInt();
		int count = 0;
		while (count < n) {
			
			String quebra = sc.nextLine();
			String aceita = "Thor";
			String nome = sc.nextLine();
			int newton = sc.nextInt();

			if (aceita.contentEquals(nome)) {
				System.out.println("Y");
			}else{
				System.out.println("N");
			}

			count++;
		}

		sc.close();
	}

}