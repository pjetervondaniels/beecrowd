import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, aux, count = 0, num = 1;
		while (sc.hasNext()) {
			number = sc.nextInt();
			count++;
			for (int i = 1; i <= number; i++) {
				aux = i;
				for (int j = 0; j < aux; j++) {
					num++;
				}
			}
			if (number == 0) {
				System.out.printf("Caso %d: %d numero\n", count, num);

			} else {
				System.out.printf("Caso %d: %d numeros\n", count, num);
			}
			System.out.printf("%d ", 0);
			for (int i = 1; i <= number; i++) {
				aux = i;
				for (int j = 0; j < aux; j++) {
					System.out.printf("%d ", i);
				}
			}
			System.out.println();
			num = 1;
		}
		sc.close();
	}
}