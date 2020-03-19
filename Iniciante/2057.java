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
		
		int S = sc.nextInt();
		int T = sc.nextInt();
		int F = sc.nextInt();
		
		if(S==0) {
			S=24;
		}
		
		int Soma = S+T+F;
		
		if(Soma>=24) {
			Soma-=24;
		}
		
		System.out.println(Soma);
		
		sc.close();
	}

}