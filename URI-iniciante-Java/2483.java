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
		int I = sc.nextInt();
		System.out.printf("Feliz nat");
		for(int i=0;i<I;i++) {
			System.out.printf("a");
		}
		System.out.println("l!");
		sc.close();
	}

}