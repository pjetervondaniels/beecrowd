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
		int n;
		double mean=0,count=0;
		do {
			n=sc.nextInt();
			count++;
			if(n>0) {
				mean= mean+n;
			}
		}while(n>0);
		count=count-1;
		mean=mean/count;
		
		System.out.println(String.format("%.2f", mean));
		
		
		sc.close();
	}

}