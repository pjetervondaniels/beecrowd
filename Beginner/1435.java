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
		int n=0;
		do {
			n = sc.nextInt();
			int count=1;
			int matriz[][]=new int[n][n];
			int q=8;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					
				}
				}
				
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.printf(" "+count);
				}
				
				System.out.println("\n");
			}
		}while(n!=0);
		
		
		
		
		
		
		sc.close();
	}

}