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
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count =0;
		
		if(x>y) {
			for(int i=1;i<=x;i++) {
				if(count<=1) {
					System.out.printf("%d ",i);
					count++;
				}
				
				if(count==2) {
					System.out.println(i+1);
					count=0;
					i++;
				}
			}
		}
		
		if(y>x) {
			for(int i=1;i<=y;i++) {
				if(count<=1) {
					System.out.printf("%d ",i);
					count++;
				}
				
				if(count==2) {
					System.out.println(i+1);
					count=0;
					i++;
				}
			}
			
		}
		
		
		
		sc.close();
	}

}