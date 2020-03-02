/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  01/03/2020			  |
*   ----------------------------------
*
*/
#include <stdio.h>

void main ()
{

	unsigned short i, numLampadas;
	char stringAlfabeto[30];
	unsigned lampadas;

	while (scanf("%s", stringAlfabeto) != EOF)
	{

		scanf("%hu", &numLampadas);

		while (numLampadas--)
		{

			scanf("%u", &lampadas);
			printf("%c", stringAlfabeto[lampadas - 1]);

		}

		printf("\n");

	}

}
