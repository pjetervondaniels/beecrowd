
#include <stdio.h>
#include <string.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/



void main (void)
{

	char palavra1[25], palavra2[25];
	unsigned short i, j, tamanho1, tamanho2;

	scanf("%s %s", palavra1, palavra2);

	if (strcmp(palavra1, palavra2) > 0)
	{	
		printf("%s\n", palavra2);
		printf("%s\n", palavra1);
	}
	else if (strcmp(palavra1, palavra2) < 0)
	{
		printf("%s\n", palavra1);
		printf("%s\n", palavra2);
	}
}
