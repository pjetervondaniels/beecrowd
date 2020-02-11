import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

        String linha;

        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            
    		
    		String soren = "LIFE IS A NOT PROBLEM TO BE SOLVED";
    		
    		char vetor[]=new char[34];
    		for(int i=0;i<34;i++) {
    			vetor[i]=soren.charAt(i);
    		}
    		
    		for(int j=0;j<n;j++) {
    			System.out.printf("%c",vetor[j]);
    		}
    		
    		System.out.println(" ");
    		
            
        }
        sc.close();
    }
}