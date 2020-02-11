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
		
		int y =0;
		int count=0;
		
		int x = sc.nextInt();
		
		do{
			y=sc.nextInt();
		}while(x>y);
		
		int soma=x;
		int k = x+1;
		
		while(soma<=y) {
			soma+=k;
			count++;
			k++;
		}
		
		System.out.println(count);
		
		sc.close();
	}

}