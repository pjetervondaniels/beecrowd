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
		do {
			System.out.println("I="+i+" J="+j);
			j-=1;
			if(j==5) {
				System.out.println("I="+i+" J="+j);
				i+=2;
				j=7;
			}
		}while(i<=9 && j!=5);
		
		
		sc.close();
	}

}