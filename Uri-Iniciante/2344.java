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
		int n=0;
		n = sc.nextInt();
		if(n==0) {
			System.out.println("E");
		}
		if(n>=1 && n<=35) {
			System.out.println("D");
		}
		if(n>=36 && n<=60) {
			System.out.println("C");
		}
		if(n>=61 && n<=85) {
			System.out.println("B");
		}
		if(n>=86 && n<=100) {
			System.out.println("A");
		}
		
		
		sc.close();
	}

}