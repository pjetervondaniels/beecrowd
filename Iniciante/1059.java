package uri_solutions;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri1059 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int i;
		for(i=1;i<=100;i++){
			if(i%2==0){
				System.out.printf("%d\n",i);
			}
		}
		
		
		sc.close();
	}

}
