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
			double a,b,divisao;
			a = sc.nextDouble();
			b = sc.nextDouble();
			if(b==0) {
				System.out.println("divisao impossivel");
			}else {
				divisao = a/b;
				System.out.println(String.format("%.1f", divisao));
			}
				
			
			
		}
		
		
		sc.close();
	}

}