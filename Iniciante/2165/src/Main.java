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
		
		String tweet = sc.nextLine();
		
		if(tweet.length()<=140) {
			System.out.println("TWEET");
		}else
			System.out.println("MUTE");
		sc.close();
	}

}