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
		String tipo,classe,alimentacao;
		
		tipo=sc.nextLine();
		classe=sc.nextLine();
		alimentacao=sc.nextLine();
		
		String tipo1="vertebrado";
		String tipo2="invertebrado";
		String classe1="ave";
		String classe2="mamifero";
		String classe3="inseto";
		String classe4="anelideo";
		
		String alimentacao_1="carnivoro";
		String alimentacao_2="onivoro";
		String alimentacao_3="herbivoro";
		String alimentacao_4="hematofogo";
		
		if(tipo==tipo1) {
			if(classe==classe1) {
				if(alimentacao==alimentacao_1) {
					System.out.println("aguia");
				}
				if(alimentacao==alimentacao_2) {
					System.out.println("pomba");
				}
			}
			if(classe==classe2) {
				if(alimentacao==alimentacao_2) {
					System.out.println("homem");
				}
				if(alimentacao==alimentacao_3) {
					System.out.println("vaca");
				}
			}
		}
		if(tipo==tipo2) {
			if(classe==classe3) {
				if(alimentacao==alimentacao_4) {
					System.out.println("pulga");
				}
				if(alimentacao==alimentacao_3) {
					System.out.println("lagarta");
				}
			}
			if(classe==classe4) {
				if(alimentacao==alimentacao_4) {
					System.out.println("sanguessuga");
				}
				if(alimentacao==alimentacao_2) {
					System.out.println("minhoca");
				}
			}
		}
		
		
		sc.close();
	}

}