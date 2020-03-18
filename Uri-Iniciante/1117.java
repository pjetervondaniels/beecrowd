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
		double x,y,mean,k=0;
		
		do {
			x = sc.nextDouble();
			if(x<0 || x>10) {
				System.out.println("nota invalida");
				k++;
			}
			
			y= sc.nextDouble();
			
			if(k==1 || y<0 || x>10) {
				System.out.println("nota invalida");
				k++;
			}
			
			if(x>=0 && x<=10 && y>=0 && y<=10 ) {
				mean= (x+y)/2;
				System.out.println("media = "+String.format("%.2f", mean));
				k=0;
			}
				
		}while(k!=0);
		
		
		sc.close();
	}

}