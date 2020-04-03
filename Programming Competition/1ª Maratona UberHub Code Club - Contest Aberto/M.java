package Contest;

import java.io.IOException;
import java.util.Scanner;

public class M {
	
    public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int E = sc.nextInt();
        int X = 0;
        for (int i = 0; i < N; i++) {
        	int A = sc.nextInt();
        	int B = sc.nextInt();
        	int C = sc.nextInt();
        	if (((A + B + C) / 3) >= E)
        		X++;
        }
        System.out.printf("Existe(m) %d candidata(s) estonteante(s)!",  X);
    }
	
}