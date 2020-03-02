
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

 float a = 0;
scanf("%f", &a);

if (a >= 0 && a <= 25)
  printf("Intervalo [0,25]\n");
else if (a > 25 && a <= 50)
  printf("Intervalo (25,50]\n");
else if (a > 50 && a <= 75)
  printf("Intervalo (50,75]\n");
else if (a > 75 && a <= 100)
  printf("Intervalo (75,100]\n");
else
  printf("Fora de intervalo\n");




   return 0;
   
}
