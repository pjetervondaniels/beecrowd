package Contest;

import java.io.IOException;
import java.util.Scanner;

public class F {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong() * 2;
        Long C = sc.nextLong() * 3;
        Long X = sc.nextLong();
        Long Y = sc.nextLong();
        Long Z = sc.nextLong();
        if (X >= A && Y >= B && Z >= C) 
        	System.out.println("SIM");
        else
        	System.out.println("NAO");
    }
	
}