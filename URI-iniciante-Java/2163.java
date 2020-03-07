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
		int m = sc.nextInt();
		int k=0,l=0;
		int matriz[][] = new int[n+5][m+5];		
		
		for(int i=0;i<n;i++) {
			for(int j = 0; j<m;j++) {
				matriz[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j = 0; j<m;j++) {
				if(matriz[i][j]==42 && matriz[i+1][j]==7 && matriz[i-1][j]==7 &&matriz[i-1][j-1]==7 && matriz[i-1][j-1]==7 && matriz[i-1][j+1]==7
					&& matriz[i+1][j-1]==7 && matriz[i+1][j]==7 && matriz[i+1][j+1]==7) {
					k=i+1;
					l=j+1;
				}
			}
		}
		
		System.out.println(k+" "+l);
		
		sc.close();
	}

}