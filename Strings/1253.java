import java.util.Scanner;

public class Uri1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int loopControl = 0;
		while(loopControl < range) {
			sc.nextLine();
			String phrase = sc.nextLine();
			int selectRange = sc.nextInt();
			for(int i = 0; i<phrase.length(); i++) {
				char phraseInverted = (char) (phrase.charAt(i)-selectRange);
				System.out.printf("%c",phraseInverted);
			}
			loopControl++;
		}
		
		sc.close();
	}
}