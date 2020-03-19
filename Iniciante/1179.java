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
		
		int vetor_impar[] = new int[5];
		int vetor_par[] = new int[5];
		
		int valor=0;
		int count_impar=0,count_par=0;
		
		int par=0,impar=0,j=1,l=1;
		
		for(int i=0;i<15;i++) {
			valor = sc.nextInt();
			
			if(valor%2==0 && count_par<5 && par==0) {
				vetor_par[count_par]=valor;
				count_par++;
				System.out.println("teste");
			}
			
			if(valor%2==0 && count_par>5 && par==0) {
				for(int k=0;k<5;k++) {
					System.out.println("par["+k+"] = "+vetor_par[k]);
				}
				count_par=0;
				vetor_par[count_par]=valor;
				par=1;
				count_par++;
				System.out.println("teste");
			}
			
			if(valor%2==0 && count_par<5 && par==1) {
				vetor_par[count_par]=valor;
				count_par++;
				j++;
			}
						
			if(valor%2!=0 && count_impar<5 && impar==0) {
				vetor_impar[count_impar]=valor;
				count_impar++;
			}
			
			if(valor%2!=0 && count_impar>5 && impar==0) {
				for(int k=0;k<5;k++) {
					System.out.println("impar["+k+"] = "+vetor_impar[k]);
				}
				count_impar=0;
				vetor_impar[count_impar]=valor;
				impar=1;
				count_impar++;
			}
			
			if(valor%2!=0 && count_par<5 && impar==1) {
				vetor_par[count_par]=valor;
				count_par++;
				l++;
			}		
		}
		
		for(int n=0;n<j;n++) {
			System.out.println("par["+n+"] = "+vetor_par[n]);
		}
		
		for(int q=0;q<l;q++) {
			System.out.println("impar["+q+"] = "+vetor_impar[q]);
		}
		
		
		sc.close();
	}

}