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
		
		System.out.println("---------------------------------------");
		System.out.println("|x = 35                               |");
		System.out.println("|                                     |");
		System.out.println("|               x = 35                |");
		System.out.println("|                                     |");
		System.out.println("|                               x = 35|");
		System.out.println("---------------------------------------");
		
		sc.close();
	}

}