

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

  signed short int a, b, resultado, resto;

  scanf("%hd %hd", &a, &b);

  resultado = (int)a/b;
  resto = a%b;
  printf("%d %d\n", resultado, resto);



}
