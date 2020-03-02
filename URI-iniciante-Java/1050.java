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
		int ddd;
		ddd = sc.nextInt();
		
		if(ddd==61) {
			System.out.println("Brasilia");
		}
		if(ddd==71) {
			System.out.println("Salvador");
		}
		if(ddd==11) {
			System.out.println("Sao Paulo");
		}
		if(ddd==21) {
			System.out.println("Rio de Janeiro");
		}
		if(ddd==32) {
			System.out.println("Juiz de Fora");
		}
		if(ddd==19) {
			System.out.println("Campinas");
		}
		if(ddd==27) {
			System.out.println("Vitoria");
		}
		if(ddd==31) {
			System.out.println("Belo Horizonte");
		}
		if(ddd!=61 && ddd!=71 && ddd!=11 && ddd!=21 && ddd!=32 && ddd!=19 && ddd!=27 && ddd!=31) {
			System.out.println("DDD nao cadastrado");
		}
		sc.close();
	}

}