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
		int i=0;
		do {
			int H = sc.nextInt();
			int M = sc.nextInt();
			int O = sc.nextInt();
		
			if(O==0 && H>=10 && M>=10) {
				System.out.println(H+":"+M+" - A porta fechou!");
			}
			if(O==0 && H<10 && M<10) {
				System.out.println("0"+H+":0"+M+" - A porta fechou!");
			}
			if(O==0 && H<10 && M>=10) {
				System.out.println("0"+H+":"+M+" - A porta fechou!");
			}
			if(O==0 && H>=10 && M<10) {
				System.out.println(H+":0"+M+" - A porta fechou!");
			}
			
			
			if(O==1 && H>=10 && M>=10) {
				System.out.println(H+":"+M+" - A porta abriu!");
			}
			if(O==1 && H<10 && M<10) {
				System.out.println("0"+H+":0"+M+" - A porta abriu!");
			}
			
			if(O==1 && H<10 && M>=10) {
				System.out.println("0"+H+":"+M+" - A porta abriu!");
			}
			if(O==1 && H>=10 && M<10) {
				System.out.println(H+":0"+M+" - A porta abriu!");
			}
			
			
			i++;
			
		}while(i<n);
		
		
		
		sc.close();
	}

}