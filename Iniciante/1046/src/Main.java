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
		int hora_inicial,hora_final;
		int contador=0;
		
		hora_inicial = sc.nextInt();
		hora_final = sc.nextInt();
		
		if(hora_final<=hora_inicial){
			hora_final = hora_final+24;
		}
		
		for(int i= hora_inicial;i<hora_final;i++) {
			contador++;
		}
		System.out.println("O JOGO DUROU "+contador+" HORA(S)");
		
		sc.close();
	}

}