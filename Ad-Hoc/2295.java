import java.util.Scanner;

public class URI2295 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double priceA = sc.nextDouble();
		double priceG = sc.nextDouble();
		double rendA = sc.nextDouble();
		double rendG = sc.nextDouble();
		
		if(priceA*rendA > priceG*rendG) {
			System.out.println("G");
		}
		if(priceA*rendA < priceG*rendG) {
			System.out.println("A");
		}
		
		sc.close();
	}
}
