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

	/* um objeto BufferedReader e chame o método readLine() até que ele retorne null. 
          Lembrando que o método readLine() da classe BufferedReader() retorna uma String.
          E como no seu exercício você está lidando com um número,
		 basta converter a String para int.
	*/

        String linha;

        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            int i=0;
            double nota,ch=0,total_n=0,total_ch=0;
            while(i<n) {
            	nota = sc.nextDouble();
            	ch = sc.nextDouble();
            	total_n+=(nota*ch);
            	total_ch+=ch;
            	i++;
            }
            total_ch*=100;
            double f = total_n/total_ch;
            System.out.println(String.format("%.4f", f));
        }
		sc.close();
	}

}