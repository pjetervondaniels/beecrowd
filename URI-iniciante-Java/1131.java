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
		int g_gremio=0,g_inter=0,op=0,count_gremio=0,count_inter=0,empate=0,count_jogos=0;
		
		do {
			g_inter = sc.nextInt();
			g_gremio = sc.nextInt();
			if(g_gremio>g_inter) {
				count_gremio+=1;
			}
			if(g_inter>g_gremio) {
				count_inter+=1;
			}
			if(g_inter==g_gremio) {
				empate+=1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			op=sc.nextInt();
			count_jogos+=1;
		}while(op!=2);
		System.out.println(count_jogos+" grenais");
		System.out.println("Inter:"+count_inter);
		System.out.println("Gremio:"+count_gremio);
		System.out.println("Empate:"+empate);
		
		if(count_inter>count_gremio) {
			System.out.println("Inter venceu mais");
		}
		if(count_gremio>count_inter) {
			System.out.println("Gremio venceu mais");
		}
		if(count_gremio==count_inter) {
			System.out.println("Nao houve vencedor");
		}
		sc.close();
	}

}