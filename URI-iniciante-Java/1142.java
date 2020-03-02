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
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n*4;i++) {
			if(i%4==0) {
				System.out.println("PUM");
			}
			if(i%4!=0) {
				System.out.printf("%d ",i);
			}
		}
		
		sc.close();
	}

}