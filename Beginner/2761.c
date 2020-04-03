#include <stdio.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  28/02/2020			  |
*   ----------------------------------
*
*/

int main ()
{

	int a;
	float b;
	char c;
	char d[50];

	scanf("%d %f %c %[^\n]", &a, &b, &c, d);

	printf("%d%f%c%s\n", a, b, c, d);
	printf("%d\t%f\t%c\t%s\n", a, b, c, d);
	printf("%10d%10f%10c%10s\n", a, b, c, d);

	return 0;
}
