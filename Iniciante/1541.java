import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A, B, C, X;
        while ((A = leitor.nextInt()) != 0) {
        	B = leitor.nextInt();
        	C = leitor.nextInt();
        	X = Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)X);
        }
        leitor.close();
    }
	
}