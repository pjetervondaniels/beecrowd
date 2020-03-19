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
		
		float salary;
		salary = sc.nextFloat();
		
		if(salary<=2000.00) {
			System.out.println("Isento");
		}
		else {
			
			float tax=salary-2000;
			float tribute=0;
			
			if(tax>=0.01) {
				if(tax<=1000) {
					tribute=(float)(tax*0.08);
					tax=0;
				}else{
					tribute=(float)(1000*0.08);
					tax=tax-1000;
				}
			}
			
			if(tax>=0.01) {
				if(tax<=1500) {
					tribute=tribute+(float)(tax*0.18);
					tax=0;
				}else {
					tribute=tribute+(float)(1500*0.18);
					tax=tax-1500;
				}
			}
			
			if(tax>=0.01) {
				tribute=tribute+(float)(tax*0.28);
			}
			System.out.println("R$ "+String.format("%.2f", tribute));
		}
		
				
		
		sc.close();
	}

}