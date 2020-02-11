import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte t1 = sc.nextByte();
		byte t2 = sc.nextByte();
		byte t3 = sc.nextByte();
		byte t4 = sc.nextByte();
		System.out.println(t1 + t2 + t3 + t4 - 3);
		sc.close();
	}
}