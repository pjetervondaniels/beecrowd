import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		float N;
		N =sc.nextFloat();
		
		if(N>=0 && N<=25.0000) {
			System.out.println("Intervalo [0,25] ");
		}
		if(N>=25.0001 && N<=50.0000) {
			System.out.println("Intervalo (25,50] ");
		}
		if(N>=50.0001 && N<=75.0000) {
			System.out.println("Intervalo (50,75] ");
		}
		if(N>=75.0001 && N<=100.000) {
			System.out.println("Intervalo (75,100] ");
		}
		if(N<0 || N>100) {
			System.out.println("Fora de intervalo ");
		}
		sc.close();
	}

}