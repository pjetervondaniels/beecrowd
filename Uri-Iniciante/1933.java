import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C;
		
		if (A == B) {
			C = A;
		} else {
			if (A > B) {
				C = A;
			} else {
				C = B;
			}
		}
		
		System.out.println(C);
		sc.close();
	}

}