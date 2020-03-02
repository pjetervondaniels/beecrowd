package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class uri1044 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(B%A==0 || A%B==0){
			System.out.println("Sao Multiplos\n");
		}else{
			if(B%A!=0 || A%B==0){
				System.out.println("Nao sao Multiplos\n");
			}
		}
		sc.close();
	}

}