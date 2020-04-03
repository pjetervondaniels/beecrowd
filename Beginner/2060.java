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
		int n = sc.nextInt();
		int count[] = new int [4];
		int vetor [] = new int [n];
		
		for(int i=0;i<n;i++) {
			vetor[i]= sc.nextInt();
		}
		int k=0;
		
		for(int j=2;j<=5;j++) {
			for(int i=0;i<n;i++) {
				if(vetor[i]%j==0) {
					count[k]=count[k]+1;
				}
			}
			k++;
		}
		
		System.out.println(count[0]+" Multiplo(s) de 2");
		System.out.println(count[1]+" Multiplo(s) de 3");
		System.out.println(count[2]+" Multiplo(s) de 4");
		System.out.println(count[3]+" Multiplo(s) de 5");
		
		
		sc.close();
	}

}