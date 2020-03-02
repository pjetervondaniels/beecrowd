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
		
		int number_y=sc.nextInt();
		int number_x=sc.nextInt();
		
		int contador=0;
		if(number_x<0) {
			contador=contador-(number_x);
		}
		
		for(int i=number_x;i<number_y;i++) {
			if(i%2!=0) {
				contador=contador+i;
			}
		}
		
		System.out.println(contador);
		
		
		sc.close();
	}

}