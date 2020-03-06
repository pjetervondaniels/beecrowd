import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linha;

		while ((linha = br.readLine()) != null) {
			int n = Integer.parseInt(linha);
			int m = sc.nextInt();
			
			// n hora e m minuto
			
			int time = n*60+m+30;
			int time_expired = 8*60;
			int atraso=0;
			
			while(time<time_expired-10) {
				time+=1;
				atraso+=1;
			}
			
			if(atraso>=60) {
				System.out.println("Atraso maximo: 0");
			}else
				System.out.println("Atraso maximo: "+atraso);
			
		}
		sc.close();
	}

}