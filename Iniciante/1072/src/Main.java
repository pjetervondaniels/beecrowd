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
			
			if(n>=10 && n<=20) {
				count_in++;
			}
			if(n<10 || n>20) {
				count_out++;
			}
		}
		System.out.println(count_in+" in");
		System.out.println(count_out+" out");
		
		
		
		sc.close();
	}

}