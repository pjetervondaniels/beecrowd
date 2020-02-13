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
		int maior=0,k,count=0,verifica=1,count_l=0,verifica_2=0;
		while(count<n) {
			k = sc.nextInt();
			if(k>=maior) {
				maior=k;
			}
			if(k<maior && verifica_2==0) {
				verifica=0;
				verifica_2=1;
				count_l=count+1;
			}
			
			count++;
		}
		
		if(verifica==0) {
			System.out.println(count_l);
		}
		if(verifica==1) {
			System.out.println("0");
		}
		
		
		
		sc.close();
	}

}