
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int v[] = new int[n];
        
        int c = 0, total = 0, a = 0;
        
        for(int i=0;i<n;i++){
            v[i] = sc.nextInt();
            total += v[i];
        }
        
        int i = 0;
        
        while(a<n){
           if(v[i]%2!=0){
                c++; i++; a++;
            }else{
                c++; i--;
            }
        }
        
        System.out.println(total - c);
        sc.close();
    }
}