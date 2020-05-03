import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		while(a != 0 && b != 0 && c != 0) {
			int volumnP = a*b*c;
			int arestCube = (int) Math.pow(volumnP,1.0 / 3.0);
			System.out.println(arestCube);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		
		sc.close();
	}
}
