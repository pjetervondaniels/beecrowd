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
		double count=0;
		 if(n==1)
			 count=0.5000000000;
		    if(n==0)
		    	count=0.0000000000;
		    for(int i=2;i<=n;i++)
		    {
		        if(i==2)
		        {
		            count=2.0+.5;
		            count=1.0/count;
		        }
		        else
		        {
		        	count=2.0+count;
		        	count=1.0/count;
		        }
		 
		    }
		    count=count+1.00;
		 
		
		System.out.println(String.format("%.10f", count));
		
		sc.close();
	}

}