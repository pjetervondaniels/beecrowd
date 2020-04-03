import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int km,minutos;
		km= sc.nextInt();
		minutos= 2*km;
		System.out.println(minutos+" minutos");
		
		sc.close();
	}

}