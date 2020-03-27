package uri;

import java.util.Scanner;

public class B {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int e = sc.nextInt();
			int s = sc.nextInt();
			int m = 0,c =0,d =0,u =0;
			int t=3010;
			for(int i=1; i<e;i++) {
				if(i==1) {
					 m = s/1000;
					 c = (s-m*1000)/100;
					 d = (s-m*1000-c*100)/10;
					 u = s-m*1000-c*100-d*10;
				}
				int mg,cg,dg,ug;
				mg = m;
				cg = c;
				dg = d;
				ug = u;
				
				m = ug;
				c = mg;
				d = cg;
				u = dg;
				
				 t = t+(m*1000+c*100+d*10+u);
				
			}
			System.out.println(t);
		}
}
