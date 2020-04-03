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
		int n=0;
		n = sc.nextInt();
		int count=0;
		double soma=0;
		
		while(count<n) {
			int pedido = sc.nextInt();
			int quantity = sc.nextInt();
			if(pedido==1001) {
				soma = soma+1.50*quantity;
			}
			if(pedido==1002) {
				soma = soma+2.50*quantity;
			}
			if(pedido==1003) {
				soma = soma+3.50*quantity;
			}
			if(pedido==1004) {
				soma = soma+4.50*quantity;
			}
			if(pedido==1005) {
				soma = soma+5.50*quantity;
			}
			count++;
		}
		System.out.println(String.format("%.2f", soma));
		sc.close();
	}

}