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
		int n =sc.nextInt();
		int loop=0;
		do {
			int r1,r2,new_raio=0;
			r1=sc.nextInt();
			r2=sc.nextInt();
			while(new_raio<r1+r2) {
				new_raio+=1;
			}
			System.out.println(new_raio);
			loop++;
		}while(loop<n);
		
		
		
		sc.close();
	}

}