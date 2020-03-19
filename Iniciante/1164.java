import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n=0,casos=0;
		int p=0,i;
		n = sc.nextInt();
		
		do{
			int soma=0;
			i=1;
			p = sc.nextInt();
			while(p>i){
				if(p%i==0){
					soma=soma+i;
				}
				
				i++;
			}
			
			if(soma==p){
				System.out.printf("%d eh perfeito\n",p);
			}else{
				System.out.printf("%d nao eh perfeito\n",p);
			}
			
			casos++;
		}while(casos<n);
	
		sc.close();
	}

}