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
		
		int vetor[] = new int[20];
		
		for(int i=0;i<20;i++) {
			vetor[i]=sc.nextInt();
		}
		int n=19;
		int meio=0;
		
		for(int j=0;j<10;j++) {
			meio=vetor[n];
			vetor[n]=vetor[j];
			vetor[j]=meio;
			n--;
		}
		
		for(int k=0;k<20;k++) {
			System.out.println("N["+k+"] = "+vetor[k]);
		}
		
		
		sc.close();
	}

}