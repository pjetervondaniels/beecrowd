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
		int n =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            n = Integer.parseInt(linha);
            if(n==0) {
				System.out.println("vai ter copa!");
			}else {
				System.out.println("vai ter duas!");
			}
        }
        
		
		sc.close();
	}

}