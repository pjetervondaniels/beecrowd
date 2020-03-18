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

	unsigned short casos, i;
	double notas, cargaHoraria;
	double sumNotasHoras, sumHoras;

	while (scanf("%hu", &casos) != EOF)
	{
		sumHoras = 0;
		sumNotasHoras = 0;
		for (i = 0; i < casos; i++)
		{
			scanf("%lf %lf", &notas, &cargaHoraria);
			sumNotasHoras += notas * cargaHoraria;
			sumHoras += cargaHoraria;

		}


		printf("%.4lf\n", sumNotasHoras / (sumHoras * 100.0f));

	}
}
