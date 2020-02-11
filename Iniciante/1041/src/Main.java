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
		float x,y;
		
		x=sc.nextFloat();
		y=sc.nextFloat();
		
		if(x==0.0 && y==0.0) {
			System.out.println("Origem");
		}
		if(x>0.0 && y>0.0) {
			System.out.println("Q1");
		}
		if(x<0.0 && y>0.0) {
			System.out.println("Q2");
		}
		if(x<0.0 && y<0.0) {
			System.out.println("Q3");
		}
		if(x>0.0 && y<0.0) {
			System.out.println("Q4");
		}
		if(x!=0 && y==0.0) {
			System.out.println("Eixo X");
		}
		if(x==0.0 && y!=0) {
			System.out.println("Eixo Y");
		}
		
		sc.close();

	}

}