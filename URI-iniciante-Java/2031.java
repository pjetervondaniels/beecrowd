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
		int n = sc.nextInt();
		int count =1;
		do {
			String quebra= sc.nextLine();
			String primeiro = sc.nextLine();
			quebra= sc.nextLine();
			String segundo = sc.nextLine();
			
			if(primeiro =="ataque" && segundo== "pedra") {
				System.out.println("Jogador 1 venceu");
			}
			
			if(primeiro =="pedra" && segundo== "ataque") {
				System.out.println("Jogador 2 venceu");
			}
			
			if(primeiro =="pedra" && segundo== "pedra") {
				System.out.println("Sem ganhador");
			}
			
			if(primeiro =="pedra" && segundo== "papel") {
				System.out.println("Jogador 1 venceu");
			}
			
			if(primeiro =="papel" && segundo== "pedra") {
				System.out.println("Jogador 2 venceu");
			}
			
			if(primeiro =="papel" && segundo== "papel") {
				System.out.println("Sem ganhador");
			}
			
			if(primeiro =="ataque" && segundo== "papel") {
				System.out.println("Jogador 1 venceu");
			}
			
			if(primeiro =="papel" && segundo== "ataque") {
				System.out.println("Jogador 2 venceu");
			}
			
			if(primeiro =="ataque" && segundo== "ataque") {
				System.out.println("Sem ganhador");
			}
			
			
			
			
			
			
			
			count++;
			
			
		}while(count<=n);
		
		
		
		
		sc.close();
	}

}