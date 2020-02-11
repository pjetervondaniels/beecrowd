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
		int N=0,a=0,soma=0;
		
		do {
			N=sc.nextInt();
		}while(N<=0);
		
		do {
			a=sc.nextInt();
		}while(a<=0);
		
		
		for(int i=1;i<=N-1;i++) {
				soma+=i+a;
		}
		
		
		System.out.println(soma);
		
		sc.close();
	}

}