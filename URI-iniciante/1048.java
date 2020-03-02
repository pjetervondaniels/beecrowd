
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float salary, percentual = 0, new_salary = 0, reajust=0;
		salary = sc.nextFloat();

		if (salary > 0 && salary <= 400.00) {
			reajust = 15;
			percentual = salary * (reajust / 100);
			new_salary = salary + percentual;
		}
		if (salary >= 400.01 && salary <= 800.00) {
			reajust = 12;
			percentual = salary * (reajust / 100);
			new_salary = salary + percentual;
		}
		if (salary >= 800.01 && salary <= 1200.00) {
			reajust = 10;
			percentual = salary * (reajust / 100);
			new_salary = salary + percentual;
		}
		if (salary >= 1200.01 && salary <= 2000.00) {
			reajust = 7;
			percentual = salary * (reajust / 100);
			new_salary = salary + percentual;
		}
		if (salary > 2000.00) {
			reajust = 4;
			percentual = salary * (reajust / 100);
			new_salary = salary + percentual;
		}

		System.out.println("Novo salario: "+String.format("%.2f",new_salary));
		System.out.println("Reajuste ganho: "+String.format("%.2f", percentual));
		System.out.println("Em percentual:"+String.format("%.0f", reajust)+"% \n");
		sc.close();
	}

}