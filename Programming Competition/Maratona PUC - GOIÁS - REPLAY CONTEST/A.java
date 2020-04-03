package uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linha;
		while ((linha = br.readLine()) != null) {
			int n = Integer.parseInt(linha);
			int count = 0;
			while (n > 0) {
				n = n - 100;
				count++;
			}
			System.out.println(count);
		}
	}
}