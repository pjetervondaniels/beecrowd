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
		int n=1,xp=1,anterior=0;
		while(n!=0 && xp!=0) {
			n = sc.nextInt();
			xp = sc.nextInt();
			if(n!=0 && xp!=0) {
				xp = n*xp;
				System.out.println(xp);
			}
	
		}
		
		sc.close();
	}

}