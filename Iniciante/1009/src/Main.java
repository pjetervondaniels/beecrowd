import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		double fix_salary,sales_done;
		name=sc.nextLine();
		fix_salary=sc.nextDouble();
		sales_done=sc.nextDouble();
		fix_salary=fix_salary+(sales_done*0.15);
		System.out.println("TOTAL = R$ "+String.format("%.2f",fix_salary));
		sc.close();
	}

}