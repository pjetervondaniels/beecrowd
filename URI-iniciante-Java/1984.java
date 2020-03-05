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
		
		String n = sc.nextLine();
		int k =n.length()-1;
		char vetor[] = new char[k+1];
		for(int i=0 ;i<n.length();i++) {
			vetor[i]= n.charAt(k);
			k--;
		}
		
		for(int j=0;j<n.length();j++) {
			System.out.printf("%c",vetor[j]);
		}
		
		
		sc.close();
	}

}