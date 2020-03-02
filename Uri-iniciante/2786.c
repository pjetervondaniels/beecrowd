
#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/



void main ()
{

	unsigned short linha, coluna;

	scanf("%hu %hu", &linha, &coluna);

	printf("%hu\n", (linha * coluna) + (linha - 1) * (coluna - 1));
	printf("%hu\n",  (2 * (linha - 1)) + (2 * (coluna - 1)));

}
