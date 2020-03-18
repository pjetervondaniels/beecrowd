
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m[][] = new double[12][12];
        
        double sum = 0;
        int count = 0;
        char O = sc.next().charAt(0);
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double x = sc.nextDouble();
                m[i][j] = x;
                if (j+i+1>=12+i) {
                    sum += x;
                    count++;
                }
            }
        }
        
        
        
        if (O=='S') {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", (sum / count));
        }
        sc.close();
    }
}