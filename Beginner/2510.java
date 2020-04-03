import java.io.IOException;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int i=0;
		while(i<T) {
			String v = sc.nextLine();
			System.out.println("Y");
			i++;
		}
		
		sc.close();
	}
	
}