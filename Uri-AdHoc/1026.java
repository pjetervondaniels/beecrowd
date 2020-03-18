import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		long u = sc.nextLong();
    		long m = sc.nextLong();
    		System.out.println(u ^ m);
    	}
    	sc.close();
    }
    
}