/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  01/03/2020			  |
*   ----------------------------------
*
*/

#include <stdio.h>
#include <stdbool.h>

void main ()
{

	unsigned long qtsXp, multiplicador;

	while (true)
	{

		scanf("%lu %lu", &multiplicador, &qtsXp);

		if (multiplicador == 0 && qtsXp == 0)
			break;

		printf("%lu\n", qtsXp * multiplicador);



	}



}
