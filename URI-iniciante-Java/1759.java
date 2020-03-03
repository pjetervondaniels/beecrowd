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
		for(int i=0;i<n;i++) {
			if(i+1!=n) {
				System.out.printf("Ho ");
			}
			if(i+1==n) {
				System.out.printf("Ho!\n");
			}
		}
		
		
		
		sc.close();
	}

}