import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resto, i;
		char aux;
		int decimal = sc.nextInt();
		String[] hexa = new String[20];
		for (i = 0; i < decimal; i++) {
			resto = decimal % 16;
			decimal /= 16;
			
			if (resto <= 9) {
				hexa[i] = "" + (resto + 48);
			}
			if (resto == 10) {
				hexa[i] = "A";
			}
			if (resto == 11) {
				hexa[i] = "B";
			}
			if (resto == 12) {
				hexa[i] = "C";
			}
			if (resto == 13) {
				hexa[i] = "D";
			}
			if (resto == 14) {
				hexa[i] = "E";
			}
			if (resto == 15) {
				hexa[i] = "F";
			}
		}
		
		for (int x = 0; x < hexa.length; x++) {
			System.out.printf("%s", hexa[x]);
			
		}
		System.out.println();
		sc.close();
	}
}