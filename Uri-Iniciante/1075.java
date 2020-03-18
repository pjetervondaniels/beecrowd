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
		int i;
		for(i=0;i<10000;i++) {
			if(i%n==2) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}