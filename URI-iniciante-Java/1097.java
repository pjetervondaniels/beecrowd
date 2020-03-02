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
		int i=1,j=7;
		int inicio=7;
		
		do {
			System.out.println("I="+i+" J="+j);
			j-=1;
			if(j==inicio-2) {
				System.out.println("I="+i+" J="+j);
				i+=2;
				j=inicio+2;
				inicio+=2;
			}
			
			
		}while(i<=9 && j<=15);
		
		
		sc.close();
	}

}