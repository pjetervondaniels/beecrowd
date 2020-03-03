
/*
 * 
*/
public class Main {
	public static void main(String[] args) {

		float s = 0;
		float de = 1;
		float da = 1;
		float i = 0;

		while (de <= 39) {
			if (i == 0) {
				s = s + 1;
				i++;
			} else {
				de = de + 2;
				da = da * 2;
				s = s + de / da;

				i++;
			}

		}
		System.out.println(String.format("%.2f", s));
	}
}