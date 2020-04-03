import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N,segundos,minutos,horas;
		N=sc.nextInt();
		horas = N/3600;
		minutos = (N-(horas*60*60))/60;
		segundos= N-(horas*3600)-(minutos*60);
		
		System.out.println(horas+":"+minutos+":"+segundos);
		sc.close();
	}

}