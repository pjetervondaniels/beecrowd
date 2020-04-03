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
		Integer p =0;
		p=sc.nextInt();
		while(p!=-1) {
			if(p-1>=0) {
			System.out.println(p-1);
			}
			if(p==0) {
				System.out.println("0");
			}
			p=sc.nextInt();
		}
		sc.close();
	}

}