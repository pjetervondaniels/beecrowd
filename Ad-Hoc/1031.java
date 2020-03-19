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
		int vetor[] = { 0,1, 6, 11, 16, 5, 12, 2, 9, 17, 10, 4, 15, 14, 3, 8, 13, 7 };
		int n=0;
		do {
			n=sc.nextInt();
			if(n!=0) {
				System.out.println(vetor[n]);
			}
		}while(n!=0);
		
		sc.close();
	}

}