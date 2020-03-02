

#include <stdio.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/

int main ()
{

	unsigned short cartaA, cartaB;

	scanf("%hu %hu", &cartaA, &cartaB);

	if (cartaA == cartaB)
		printf("%hu\n", cartaA);
	else if (cartaA > cartaB)
		printf("%hu\n", cartaA);
	else
		printf("%hu\n", cartaB);

	return 0;
}
