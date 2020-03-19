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
		int vetor[] = new int[1000];

		int n = sc.nextInt();
		int i =0;
		int k=0;
		while(i<1000) {
			vetor[i]=k;
			k++;
			if(k==n) {
				k=0;
			}
			i++;
		}
		
		for(int r=0;r<1000;r++) {
			System.out.println("N["+r+"] = "+vetor[r]);
		}

		sc.close();
	}
}