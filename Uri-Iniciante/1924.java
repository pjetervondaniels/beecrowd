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
		String curso_1=" ";
		int n = sc.nextInt();
		int count = 0;
		String curso = "Ciencia da Computacao";

		while (count < n) {
			curso_1 = sc.nextLine();
			count++;
		}

		if (!curso.contentEquals(curso_1)) {
			System.out.println(curso);

		}
		sc.close();
	}
}