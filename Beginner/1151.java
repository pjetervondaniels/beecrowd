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
		do {
			n = sc.nextInt();
		}while(n<0 && n>46);
		
		
		int i = 0, count = 0, ant = 0;
		
		while (count != n) {
			
			System.out.printf("%d ", i);
			
			if (i == 0) {
				i++;
			} 
			
			if (i == 1 && count == 1) {
					i = +1;
			}
			
			if (i == 1 && count == 2) {
				ant = i;
				i+=i;
			}
			if(count>=3) {
				i+=ant;
				ant=i;
			}
			
			count++;
		}
		sc.close();
	}
}
