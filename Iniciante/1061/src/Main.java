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
		
		int dia_inicial = sc.nextInt();
		int hora_i=sc.nextInt();
		int minuto_inicial=sc.nextInt();
		int segundo_inicial=sc.nextInt();
		System.out.println("Dia "+dia_inicial);
		System.out.println(hora_i+" : "+minuto_inicial+" : "+segundo_inicial);
		
		int dia_final = sc.nextInt();
		int hora_f=sc.nextInt();
		int minuto_f =sc.nextInt();
		int segundo_f =sc.nextInt();
		System.out.println("Dia "+dia_final);
		System.out.println(hora_f+" : "+minuto_f+" : "+segundo_f);
		
		if(segundo_inicial>segundo_f) {
			segundo_f+=60;
		}
		int conta_s=0,conta_m=0,conta_h=0,conta_d=0;
		
		for(int i=segundo_inicial;i<segundo_f;i++) {
			conta_s++;
		}

		while(conta_s>=60) {
			conta_m++;
			conta_s-=60;
		}
		
		
		if(minuto_inicial>minuto_f) {
			minuto_f+=60;
		}
		
		for(int i=minuto_inicial;i<minuto_f;i++) {
			conta_m++;
		}
		
		while(conta_m>=60) {
			conta_h++;
			conta_m-=60;
		}
		
		
		if(hora_i>hora_f) {
			hora_f+=24;
		}
		
		for(int i=hora_i;i<hora_f;i++) {
			conta_h++;
		}
		
		while(conta_h>=24) {
			conta_d++;
			conta_h-=24;
		}
		
		
		if(dia_inicial>dia_final) {
			dia_final+=30;
		}
		
		for(int i=dia_inicial;i<dia_final-1;i++) {
			conta_d++;
		}
		
		
		System.out.println(conta_d+" dia(s)");
		System.out.println(conta_h+" horas(s)");
		System.out.println(conta_m+" minutos(s)");
		System.out.println(conta_s+" segundos(s)");
		

		
		sc.close();
	}

}