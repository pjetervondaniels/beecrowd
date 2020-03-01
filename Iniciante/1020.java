import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int dias,ano,mes,dia;
		dias = sc.nextInt();
		ano=dias/365;
		mes=(dias-ano*365)/30;
		dia=(dias-(ano*365)-(mes*30));
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dia+" dia(s)");
		
		sc.close();
	}

}