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
		int h_inicial,m_inicial,h_final,m_final,c_minutos,c_hora;
		
		h_inicial = sc.nextInt();
		m_inicial= sc.nextInt();
		
		h_final= sc.nextInt();
		m_final= sc.nextInt();
		
		if(h_final<=h_inicial && m_final<m_inicial){
			h_final = h_final+24;
		}
		
		c_minutos=h_final*60+m_final-(h_inicial*60+m_inicial);
		c_hora=0;
		
		while(c_minutos>=60) {
			c_hora++;
			c_minutos=c_minutos-60;
		}
	
		
		System.out.println("O JOGO DUROU "+c_hora+" HORA(S) E "+c_minutos+" MINUTO(S)");
		
		sc.close();
	}

}