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
		int number=sc.nextInt();
		int contador=0;
		for(int i=number;contador<6;i++) {
			if(i%2!=0) {
				System.out.println(i);
				contador++;
			}
		}
		
		
		
		sc.close();
	}

}