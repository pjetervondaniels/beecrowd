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
		int n,q_gasolina=0,q_alcool=0,q_diesel=0;
		do {
			n=sc.nextInt();
			if(n==1) {
				q_alcool+=1;
			}
			if(n==2) {
				q_gasolina+=1;
			}
			if(n==3) {
				q_diesel+=1;
			}
		}while(n!=4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+q_alcool);
		System.out.println("Gasolina: "+q_gasolina);
		System.out.println("Diesel: "+q_diesel);
		
		sc.close();
	}

}