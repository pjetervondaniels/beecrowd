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
		int n = sc.nextInt();
		int count =0;
		String s;
		double nota[] = new double[7];
		double dificuldade,maior=0,menor=0;
		do {
			String quebra = sc.nextLine();
			s = sc.nextLine();
			dificuldade = sc.nextDouble();
			for(int i =0;i<7;i++) {
				nota[i]=sc.nextDouble();
				if(i==0) {
					maior = nota[0];
					menor = nota[0];
				}
				if(nota[i]>maior) {
					maior=nota[i];
				}
				if(nota[i]<menor) {
					menor=nota[i];
				}
			}
			
			double soma=0;
			for(int j =0;j<7;j++) {
				soma = soma+nota[j];
			}
			soma=soma-maior-menor;
			soma= soma*dificuldade;
			System.out.println(s+" "+String.format("%.2f", soma));
			count++;
		}while(count<n);
		
		
		sc.close();
	}

}