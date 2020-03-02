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
		int i=1,j=60;
		while(j>=0) {
			System.out.println("I="+i+" J="+j);
			i+=3;
			j-=5;
		}
		
		
		sc.close();
	}

}