import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number,hours;
		double salary_hours;
		
		number = sc.nextInt();
		hours= sc.nextInt();
		salary_hours = sc.nextDouble();
		salary_hours=salary_hours*hours;
		
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = U$ "+String.format("%.2f",salary_hours));

		sc.close();
	}

}