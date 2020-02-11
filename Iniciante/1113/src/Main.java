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
		int X,Y;	
		do {
			X = sc.nextInt();
			Y = sc.nextInt();
			if(X>Y) {
				System.out.println("Decrescente");
			}
			if(Y>X) {
				System.out.println("Crescente");
			}
		}while(X!=Y);
		
		sc.close();
	}

}