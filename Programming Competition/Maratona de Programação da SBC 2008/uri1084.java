package SBC2008;

import java.util.Scanner;

/*  
 * link: https://www.urionlinejudge.com.br/judge/pt/problems/view/1084
 * 	MARATONA DE PROGRAMAÇÃO DA SBC 2008
 */

public class uri1084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int removed = sc.nextInt();

		while (numbers != 0 && removed != 0) {
			int number_choosed = sc.nextInt();
			char vector[] = new char[numbers];
			String divido = Integer.toString(number_choosed);
			for (int i = 0; i < numbers; i++) {
					vector[i] = divido.charAt(i);
			}
			for (int i = 0; i < numbers; i++) {
					System.out.println(vector[i]);
				}

			}
		
		sc.close();
	}
}
