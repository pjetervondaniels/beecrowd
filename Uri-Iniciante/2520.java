import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		while ((linha = br.readLine()) != null) {
			int n = Integer.parseInt(linha);
			int m = sc.nextInt();
			int i, j;
			int obj1 = 0, obj2 = 0;
			int str1 =0, str2=0;
			int matriz[][] = new int[n][m];
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}

			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (matriz[i][j] == 2) {
						str1 = i;
						str2= j;
					}

					if (matriz[i][j] == 1) {
						obj1 = i;
						obj2 = j;
					}
				}
			}
			
			int count = 0;

			for (i = str1; i < n; i++) {
				if (i < obj1) {
					count++;
				}
				if (i > obj1) {
					break;
				}
			}
			for (j = str2; j < m; j++) {
				if (j != obj2) {
					count++;
				}
				if (j == obj2) {
					break;
				}
			}
			System.out.println(count);
		}

		sc.close();
	}
}