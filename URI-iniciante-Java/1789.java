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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maior=0;
        String linha;

        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            
            int m = sc.nextInt();
            int contador=0;
            do {
            	int k = 0;
            	k=sc.nextInt();
            	if(k>maior) {
            		maior=k;
            	}
            	contador++;
            }while(contador<m);
            
            if(maior<10) {
            	System.out.println("1");
            }
            if(maior>=10 && maior<20) {
            	System.out.println("2");
            }
            if(maior>=20) {
            	System.out.println("3");
            }
            
        }
        
		Locale.setDefault(Locale.US);
		sc.close();
	}

}