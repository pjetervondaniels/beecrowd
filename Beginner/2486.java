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
		int T= sc.nextInt();
		while(T!=0) {
			int q=0;
			int n=0;
			int nutri=0;
			while(n<T) {
				q = sc.nextInt();
				String pula = sc.nextLine();
				String alimento = sc.nextLine();
				
				if(alimento.charAt(0)=='s') {
					nutri+=120*q;
				}
				if(alimento.charAt(0)=='m' && alimento.charAt(1)=='o') {
					nutri+=85*q;
				}
				if(alimento.charAt(0)=='m' && alimento.charAt(2)=='m') {
					nutri+=85*q;
				}
				if(alimento.charAt(0)=='g') {
					nutri+=70*q;
				}
				if(alimento.charAt(0)=='m' && alimento.charAt(2)=='n') {
					nutri+=56*q;
				}
				if(alimento.charAt(0)=='g') {
					nutri+=70*q;
				}
				if(alimento.charAt(0)=='l') {
					nutri+=50*q;
				}
				if(alimento.charAt(0)=='b') {
					nutri+=34*q;
				}
				n++;
			}
			int calcula;
			
			if(nutri>130) {
				calcula = nutri-130;
				System.out.println("Menos "+calcula+" mg");
			}
			if(nutri<110) {
				calcula = 110-nutri;
				System.out.println("Mais "+calcula+" mg");
			}
			if(nutri>=110 && nutri<=130) {
				System.out.println(nutri+" mg");
			}
			
			
			T= sc.nextInt();
		}
		
		
		sc.close();
	}

}
