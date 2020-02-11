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
			
			if(primeiro=="tesoura" && segundo=="papel") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="papel" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="papel" && segundo== "papel") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="papel" && segundo== "pedra") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="pedra" && segundo== "papel") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="pedra" && segundo== "pedra") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="pedra" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="lagarto" && segundo== "pedra") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="lagarto" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="lagarto" && segundo== "Spock") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="Spock" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="Spock" && segundo== "Spock") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="Spock" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="tesoura" && segundo== "Spock") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="tesoura" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="tesoura " && segundo== "lagarto") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="lagarto" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="lagarto" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="lagarto " && segundo== "papel") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="papel" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="lagarto" && segundo== "lagarto") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="papel" && segundo== "Spock") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="Spock" && segundo== "papel") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="papel" && segundo== "papel") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="Spock" && segundo== "pedra") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="pedra" && segundo== "Spock") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="pedra" && segundo== "pedra") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			if(primeiro =="pedra" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": Bazinga! ");
			}
			
			if(primeiro =="tesoura" && segundo== "pedra") {
				System.out.println("Caso #"+count+": Raj trapaceou! ");
			}
			
			if(primeiro =="tesoura" && segundo== "tesoura") {
				System.out.println("Caso #"+count+": De novo! ");
			}
			
			count++;
			
			
		}while(count<=n);
		
		
		
		
		sc.close();
	}

}