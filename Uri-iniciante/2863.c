

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

	int casos;
	float numero, menor;

	while (scanf("%d", &casos) != EOF)
	{

		menor = 100.0f;
		for (int i = 0; i < casos; ++i)
		{
			scanf("%f", &numero);
			if (numero < menor)
				menor = numero;

		}

		printf("%.2f\n", menor);

	}

}
