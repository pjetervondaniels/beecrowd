package poo;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Principal {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		int k=0;
		String palpite [] = new String[5];
		String vencedores [] = new String[5];
		int numeroAcertos = 0;
		int loops = 0;
		String quebraLinha = sc.nextLine();
		while(n<k) {
			System.out.println("Palpites");
			for(int i=0;i<5;i++) {
				palpite[i] = sc.nextLine();
			}
			loops++;
			System.out.println("Vencedores");
			for(int i=0;i<5;i++) {
				vencedores[i] = sc.nextLine();
			}
			loops++;
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(palpite[i].equalsIgnoreCase(vencedores[j])) {
						numeroAcertos++;
					}
				}
			}
			k++;
		}
		
		System.out.println(loops);
		System.out.println(numeroAcertos);
		sc.close();
	}

}
