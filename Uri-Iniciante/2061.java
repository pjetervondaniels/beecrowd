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
		    int n, m;
		    String string;
		    n = sc.nextInt();
		    m = sc.nextInt();
		    String quebra_linha= sc.nextLine();
		    int count = n;
		    string = sc.nextLine();
		    
		    while(m>0) {
		        if(string.charAt(0)== 'f') {
		        	count++;
		        }
		        else{
		        	count--;
		        }
		        m--;
		        
			    string = sc.nextLine();
		    }
		
		System.out.println(count);
		sc.close();
	}

}