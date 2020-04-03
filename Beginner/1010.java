import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number_piece1,number_piece2,quantity_1,quantity_2;
		double price_1,price_2;
		
		number_piece1=sc.nextInt();
		quantity_1=sc.nextInt();
		price_1=sc.nextDouble();
		
		number_piece2=sc.nextInt();
		quantity_2=sc.nextInt();
		price_2=sc.nextDouble();
		
		System.out.println("VALOR A PAGAR: R$ "+String.format("%.2f",price_1*quantity_1+price_2*quantity_2));
		sc.close();
	}

}