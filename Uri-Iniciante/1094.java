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
		int q_c=0,q_r=0,q_s=0;
		
		for(int i=0;i<n;i++) {
			int quantidade = sc.nextInt();
			char tipo = sc.next().charAt(0);
			if(tipo=='C') {
				q_c=q_c+quantidade;
			}
			if(tipo=='R') {
				q_r=q_r+quantidade;
			}
			if(tipo=='S') {
				q_s=q_s+quantidade;
			}
		}
		
		double total = q_c+q_r+q_s;
		double p_c,p_r,p_s;
		
		p_c= (q_c*100)/total;
		p_r= (q_r*100)/total;
		p_s= (q_s*100)/total;
		
		System.out.println("Total: "+String.format("%.0f", total)+" cobaias");
		System.out.println("Total de coelhos: "+q_c);
		System.out.println("Total de ratos: "+q_r);
		System.out.println("Total de sapos: "+q_s);
		System.out.println("Percentual de coelhos: "+String.format("%.2f", p_c)+" %");
		System.out.println("Percentual de ratos: "+String.format("%.2f", p_r)+" %");
		System.out.println("Percentual de sapos: "+String.format("%.2f", p_s)+" %");
		
		
		sc.close();
	}

}