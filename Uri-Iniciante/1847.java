import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt();

		if(a > b && b <= c) {
			System.out.println(":)");
		}
		if(a < b && b >= c) {
			System.out.println(":(");
		}
		 if(a < b && b < c && (c - b) < (b - a)) {
			 System.out.println(":(");
		 }
		if(a < b && b < c && (c - b) >= (b - a)) {
			System.out.println(":)");
		}
		if(a > b && b > c && (c - b) > (b - a)) {
			System.out.println(":)");
		}
		if(a > b && b > c && (c - b) <= (b - a)) {
			System.out.println(":(");
		}
		if(a == b) {
			if(b < c) {
				System.out.println(":)");
			}
			if(b>c) {
				System.out.println(":(");
			}
			
		}
		sc.close();
	}
}