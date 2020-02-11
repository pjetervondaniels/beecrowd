import java.io.IOException;
import java.util.Scanner;
/*
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
 * A seguir, calcule a média do aluno,
 *  sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
 * Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/
public class program {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double A,B,C,MEDIA;
		A= sc.nextDouble();
		B=sc.nextDouble();
		C=sc.nextDouble();
		MEDIA=(A*2+B*3+C*5)/10;
		System.out.println("MEDIA = "+String.format("%.1f", MEDIA));
		sc.close();
	}

}
