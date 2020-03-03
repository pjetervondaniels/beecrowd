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
		int loop=0;
		do {
			int p = sc.nextInt();
			int contador_primo=0;
			for(int i=1;i<=p;i++) {
				if(p%i==0) {
					contador_primo++;
				}
			}
			if(contador_primo>2) {
				System.out.println(p+" nao eh primo");
			}
			if(contador_primo<=2) {
				System.out.println(p+" eh primo");
			}
			loop++;
		}while(loop<n);
		
		
		
		
		sc.close();
	}

}