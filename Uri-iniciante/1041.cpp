
#include<stdio.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  27/02/2020			  |
*   ----------------------------------
*
*/



int main() 
{
float x, y;

	scanf("%f %f", &x, &y);

	if (x == 0 && y == 0)
		printf("Origem\n");
	else if (x == 0)
		printf("Eixo Y\n");
	else if (y == 0)
		printf("Eixo X\n");
	else if (x < 0 && y > 0)
		printf("Q2\n");
	else if (x > 0 && y > 0)
		printf("Q1\n");
	else if (x < 0 && y < 0)
		printf("Q3\n");
	else
		printf("Q4\n");
 




   return 0;
   
}
