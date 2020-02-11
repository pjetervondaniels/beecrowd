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
		
		String nome = sc.nextLine();
		
		if(nome.length()<=80) {
			System.out.println("YES ");
		}else
			System.out.println("NO");
		
		sc.close();
	}

}