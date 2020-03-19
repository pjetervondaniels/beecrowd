import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			System.out.println(log2(N));
		}
		sc.close();
		
	}
	
	private static int log2(int N) {
		return (int) (Math.log(N) / Math.log(2));
	}
	
}