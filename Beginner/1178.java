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
		double []vetor = new double[100];
		double n = sc.nextDouble();
		for(int i=0;i<100;i++) {
			if(i==0) {
				vetor[0]=n;
			}
			if(i!=0) {
				vetor[i]=vetor[i-1]/2;
			}
		}
		for(int r=0;r<100;r++) {
			System.out.println("N["+r+"] = "+String.format("%.4f", vetor[r]));
		}
		
		
		sc.close();
	}

}