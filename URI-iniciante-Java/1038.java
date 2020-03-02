package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class uri1038 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero_pedido = sc.nextInt();
		int tipo_pedido = sc.nextInt();		
		float pedido=0;
		switch(numero_pedido) {
		case 1:
			pedido = (float)(4.00*numero_pedido);
			break;
		case 2:
			pedido = (float)(4.50*numero_pedido);
			break;
		case 3:
			pedido = (float)(5.00*numero_pedido);
			break;
		case 4:
			pedido = (float)(2*numero_pedido);
			break;
		case 5:
			pedido = (float)(1.50*numero_pedido);
			break;
		}
		
		System.out.println("TOTAL: R$"+String.format("%.2f", pedido));
		sc.close();
	}

}