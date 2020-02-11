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
		double x,y,mean;
		int k=1;
		
		do {
			k=1;
			x = sc.nextDouble();
			if(x<0 || x>10) {
				System.out.println("nota invalida");
				k=0;
			}
			
			y= sc.nextDouble();
			
			if(k==0 || y<0 || x>10) {
				System.out.println("nota invalida");
				k=0;
			}
			
			if(x>=0 && x<=10 && y>=0 && y<=10 ) {
				mean= (x+y)/2;
				System.out.println("media = "+String.format("%.2f", mean));
				System.out.println("novo calculo (1-sim 2-nao)");
				k= sc.nextInt();
			}
		}while(k!=2);
		
		
		sc.close();
	}

}