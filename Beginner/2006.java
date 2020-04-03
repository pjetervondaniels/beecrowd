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
		int vetor[] = new int[5];
		int count=0;
		
		for(int i=0;i<5;i++) {
			vetor[i]=sc.nextInt();
			if(vetor[i]==n) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
