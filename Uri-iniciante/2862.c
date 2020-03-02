

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

	unsigned short casos;
	unsigned ki;

	scanf("%hu", &casos);

	while (casos--)
	{

		scanf("%u", &ki);

		if (ki > 8000)
			printf("Mais de 8000!\n");
		else
			printf("Inseto!\n");

	}

}
