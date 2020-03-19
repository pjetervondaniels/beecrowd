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
		
		int number_cases,count_in=0,count_out=0,n;
		number_cases=sc.nextInt();
		
		for(int i=0;i<number_cases;i++) {
			n=sc.nextInt();
			
			if(n<0 && n%2==0) {
				System.out.println("EVEN NEGATIVE");
			}
			if(n>0 && n%2==0) {
				System.out.println("EVEN POSITIVE");
			}
			if(n<0 && n%2!=0) {
				System.out.println("ODD NEGATIVE");
			}
			if(n>0 && n%2!=0) {
				System.out.println("ODD POSITIVE");
			}
			if(n==0) {
				System.out.println("NULL");
			}
		}
		
		
		
		sc.close();
	}

}