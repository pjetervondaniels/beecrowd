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
			vetor[i]=sc.nextInt();
		}
		
		for(int j=0;j<10;j++) {
			if(vetor[j]<=0) {
				vetor[j]=1;
			}
		}
		
		for(int k=0;k<10;k++) {
			System.out.println("X["+k+"] = "+vetor[k]);
		}
		
		
		sc.close();
	}

}