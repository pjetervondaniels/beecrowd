package Contest;

import java.io.IOException;
import java.util.Scanner;

public class D {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double X = sc.nextInt();
        double percent = (X * 100.0) / N;
        if (percent > 60)
        	System.out.println("Ta muito feliz!");
        else if (percent >= 50) 
        	System.out.println("Ta feliz!");
        else 
        	System.out.println("Ta triste!");
    }
	
}