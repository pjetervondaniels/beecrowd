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
		double matriz[][] = new double [12][12];
		
		int L = sc.nextInt();
		char T = sc.next().charAt(0);
		
		for(int c=0;c<12;c++) {
			for(int h=0;h<12;h++) {
				matriz[c][h]=sc.nextDouble();
			}
		}
		
		if(T=='S') {
			for(int i=0;i<12;i++) {
				matriz[L][i]=sc.nextDouble();
			}
			double soma=0;
			for(int i=0;i<12;i++) {
				soma=soma+matriz[L][i];
			}
			System.out.println(String.format("%.1f", soma));
		}
		
		if(T=='M') {
			for(int i=0;i<12;i++) {
				matriz[L][i]=sc.nextDouble();
			}
			double mean=0;
			for(int i=0;i<12;i++) {
				mean=mean+matriz[L][i];
			}
			System.out.println(String.format("%.1f", mean));
		}
		

		sc.close();
	}
}