package SBC2008;

import java.util.Scanner;

/*  
 * link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1091
 * 	MARATONA DE PROGRAMAÇÃO DA SBC 2008
 */
public class uri1091 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, n, m, x, y, i;
		boolean loop = true;
		while (loop == true) {
			k = sc.nextInt();
			if (k == 0) {
				break;
			}

			n = sc.nextInt();
			m = sc.nextInt();

			for (i = 0; i < k; i++) {
				x = sc.nextInt();
				y = sc.nextInt();
				if (x == n || y == m) {
					System.out.println("divisa\n");
				}
				if (x > n && y > m) {
					System.out.println("NE\n");
				}
				if (x > n && y < m) {
					System.out.println("SE\n");
				}
				if (x < n && y > m) {
					System.out.println("NO\n");
				}
				if (x < n && y < m) {
					System.out.println("SO\n");
				}
			}
		}
		sc.close();
	}
}
