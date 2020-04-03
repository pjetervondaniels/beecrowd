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
		String i = "IMPAR";
		String p = "PAR";
		int soma;
		int n=0,casos=0;
		n=sc.nextInt();
		while(casos<n) {
			soma=0;
			String nome_1 = sc.nextLine();
			String quebra = sc.nextLine();
			String escolha_1 = sc.nextLine();
			quebra = sc.nextLine();
			String nome_2 = sc.nextLine();
			quebra = sc.nextLine();
			String escolha_2 = sc.nextLine();
			
			int num_1 = sc.nextInt();
			int num_2 = sc.nextInt();
			
			soma=num_1+num_2;
			
			if(soma%2==0 && escolha_1.contentEquals(p)) {
				System.out.println(nome_1);
			}
			if(soma%2==0 && escolha_2.contentEquals(p)) {
				System.out.println(nome_2);
			}
			if(soma%2!=0 && escolha_1.contentEquals(i)) {
				System.out.println(nome_1);
			}
			if(soma%2!=0 && escolha_2.contentEquals(i)) {
				System.out.println(nome_2);
			}
			
			String break_1 = sc.nextLine();
			casos++;
		}
		
		sc.close();
	}

}