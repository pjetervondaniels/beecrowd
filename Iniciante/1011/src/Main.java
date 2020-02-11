import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double VOLUME,pi,raio;
		pi=3.14159;
		raio=sc.nextDouble();
		VOLUME = (4.0/3)*pi*(raio*raio*raio);
		System.out.println("VOLUME = "+String.format("%.3f", VOLUME));
		
		sc.close();
	}

}