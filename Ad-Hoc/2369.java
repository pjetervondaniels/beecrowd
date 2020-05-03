package URI;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class URI2369 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		int costA = 0 ,costB = 0,costC = 0,costD = 0, costT = 0;
		
		for(int i = 1; i <= n ; i++) {
			if(i <= 10) {
				costA = 7;
			}
			if(i >= 11 && i <= 30) {
				costB += 1;
			}
			if(i >= 31 && i <= 100) {
				costC += 2;
			}
			if(i >= 101) {
				costD += 5;
			}
		}
		
		costT = costA + costB + costC + costD;
		System.out.println(costT);
		
		sc.close();
	}

}