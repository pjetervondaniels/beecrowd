import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int cem,cinquenta,vinte,dez,cinco,dois,um,m_cinquenta,m_vinte,m_dez,m_cinco,m_um;
		float valor;
		
		do {
			valor = sc.nextFloat();
		}while(valor<=0 || valor>=1000000.00);
		
		cem = (int)valor/100;
		cinquenta = ((int)valor-cem*100)/50;
		vinte=((int)valor-cem*100-cinquenta*50)/20;
		dez= ((int)valor-cem*100-cinquenta*50-vinte*20)/10;
		cinco = ((int)valor-cem*100-cinquenta*50-vinte*20-dez*10)/5;
		dois = ((int)valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5)/2;
		um = ((int) valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2)/1;
		m_cinquenta= (int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1)/0.50);
		m_vinte=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50)/0.25);
		m_dez=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25)/0.10);
		m_cinco=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25-m_dez*0.10)/0.05);
		m_um = (int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25-m_dez*0.10-m_cinco*0.05)/0.01);
		
		System.out.println("NOTAS:");
		System.out.println(cem+" nota(s) de R$ 100.00");
		System.out.println(cinquenta +" nota(s) de R$ 50.00");
		System.out.println(vinte +" nota(s) de R$ 20.00");
		System.out.println(dez+" nota(s) de R$ 10.00");
		System.out.println(cinco+" nota(s) de R$ 5.00");
		System.out.println(dois+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(um+" moeda(s) de R$ 1.00");
		System.out.println(m_cinquenta+" moeda(s) de R$ 0.50");
		System.out.println(m_vinte+" moeda(s) de R$ 0.25");
		System.out.println(m_dez+" moeda(s) de R$ 0.10");
		System.out.println(m_cinco+" moeda(s) de R$ 0.05");
		System.out.println(m_um+" moeda(s) de R$ 0.01");
		
		
		sc.close();
	}

}