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
		int n,i;
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i+"^2 = "+i*i);
			}
		}
		
		
		sc.close();
	}

}