
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

int main ()
{

	unsigned short int intervalo;
	char cursos[100];

	scanf("%hd", &intervalo);

	while (intervalo != 0)
	{

		scanf("%s", cursos);
		intervalo--;
	}
	printf("Ciencia da Computacao\n");
}
