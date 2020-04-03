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

	long double qtsPatinhos;
	long double resultado;

	while (true)
	{

		scanf("%LF", &qtsPatinhos);

		if (qtsPatinhos == -1)
			break;

		if (qtsPatinhos == 0)
			printf("0\n");
		else
			printf("%.LF\n", --qtsPatinhos);

	}


}
