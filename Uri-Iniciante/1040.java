import java.io.IOException;
import java.util.Scanner;
/*
 * 
*/
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		float N1,N2,N3,N4,MEDIA;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		MEDIA = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;
		
		if(MEDIA <5.0) {
			System.out.println("Media: "+String.format("%.1f", MEDIA));
			System.out.println("Aluno reprovado.");
		}
		
		if(MEDIA>=5.0 && MEDIA<=6.9) {
			System.out.println("Media : "+String.format("%.1f", MEDIA));
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame:");
			float exame = sc.nextFloat();
			MEDIA = (MEDIA+exame)/2;
			if(MEDIA>=5.0) {
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: "+String.format("%.1f", MEDIA));	
			}
			
			if(MEDIA<5.0) {
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: "+String.format("%.1f", MEDIA));
			}
		}
		if(MEDIA>=7.0) {
			System.out.println("Media: "+String.format("%.1f", MEDIA));
			System.out.println("Aluno aprovado.");
		}
		
		sc.close();
	}
}
