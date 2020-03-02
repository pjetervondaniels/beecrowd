
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

	unsigned short distancia;

	scanf("%hu", &distancia);

	if (distancia <= 800)
		printf("1\n");
	else if (distancia <= 1400)
		printf("2\n");
	else
		printf("3\n");

	return 0;
}
