import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int valor,cem,cinquenta,vinte,dez,cinco,dois,um;
		
		do {
			valor = sc.nextInt();
		}while(valor<0 || valor>1000000);
		
		cem = valor/100;
		cinquenta = (valor-cem*100)/50;
		vinte=(valor-cem*100-cinquenta*50)/20;
		dez= (valor-cem*100-cinquenta*50-vinte*20)/10;
		cinco = (valor-cem*100-cinquenta*50-vinte*20-dez*10)/5;
		dois = (valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5)/2;
		um = (valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2)/1;
		
		System.out.println(valor);
		System.out.println(cem+" nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte +" nota(s) de R$ 20,00");
		System.out.println(dez+" nota(s) de R$ 10,00");
		System.out.println(cinco+" nota(s) de R$ 5,00");
		System.out.println(dois+" nota(s) de R$ 2,00");
		System.out.println(um+" nota(s) de R$ 1,00");
		
		
		sc.close();
	}

}