import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int time;
		double velocity,consumption;
		time = sc.nextInt();
		velocity= sc.nextDouble();
		consumption = time *(velocity/12);
		System.out.println(String.format("%.3f", consumption));
		
		
		sc.close();
	}

}