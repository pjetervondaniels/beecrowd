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
		
		int vetor[] = new int[10];
		
		for(int i=0;i<10;i++) {
			if(i==0) {
				vetor[i]=sc.nextInt();
			}
			if(i!=0) {
				vetor[i]=vetor[i-1]*2;
			}
			
		}
		for(int k=0;k<10;k++) {
			System.out.println("N["+k+"] = "+vetor[k]);
		}
		
		
		sc.close();
	}

}