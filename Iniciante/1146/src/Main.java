
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
		
		int n=1;
		
		while(n!=0) {
			n = sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println("\n");

		sc.close();
	}

}