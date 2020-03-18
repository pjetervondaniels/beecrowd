import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/

public class Main {
	public static int abs(int x) {
		if(x<0) {
			return -x;
		}else
			return x;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A,B,C,maiorAB;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		maiorAB = ((A+B)+abs(A-B))/2;
		
		if(maiorAB>C) {
			System.out.println(maiorAB+" eh o maior");
		}else
			System.out.println(C+" eh o maior");
		
		
		sc.close();
	}

}