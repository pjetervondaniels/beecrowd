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
		
		int N1, N2, N3;
		
		N1 = sc.nextInt();
		N2 = sc.nextInt();
		N3 = sc.nextInt();
		// menor
		if (N1 < N2 && N1 < N3) {
			System.out.println(N1);
		}
		if (N2 < N1 && N2 < N3) {
			System.out.println(N2);
		}
		if (N3 < N2 && N3 < N1) {
			System.out.println(N3);
		}
		
		// meio
		if (N1 > N2 && N1 < N3) {
			System.out.println(N1);
		}
		if(N1>N3 && N1<N2) {
			System.out.println(N1);
		}
		if (N2 > N1 && N2 < N3) {
			System.out.println(N2);
		}
		if(N2>N3 && N2<N1) {
			System.out.println(N2);
		}
		if (N3 > N1 && N3 < N2) {
			System.out.println(N3);
		}
		if(N3>N2 && N3<N1) {
			System.out.println(N3);
		}

		
		// maior
		
		if (N1 > N2 && N1 > N3) {
			System.out.println(N1);
		}
		if (N2 > N1 && N2 > N3) {
			System.out.println(N2);
		}
		if (N3 > N2 && N3 > N1) {
			System.out.println(N3);
		}
		
		System.out.println( );
		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);
		
		sc.close();
	}

}