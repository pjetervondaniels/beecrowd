import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while (in.hasNext()) {
			n = in.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i + j == (n - 1)) {
						System.out.print("2");
					} else if (i == j) {
						System.out.print("1");
					} else {
						System.out.print("3");
					}
				}
				System.out.println("");
			}
		}
		in.close();
	}
}