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
		
		double vetor[] = new double[100];
		
		for(int i=0;i<100;i++) {
				vetor[i]=sc.nextDouble();
		}
		
		for(int k=0;k<100;k++) {
			if(vetor[k]<=10) {
				System.out.println("A["+k+"] = "+vetor[k]);
			}
		}
		
		
		sc.close();
	}

}