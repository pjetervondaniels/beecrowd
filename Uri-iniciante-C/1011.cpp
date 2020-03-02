#include<stdio.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  25/02/2020			  |
*   ----------------------------------
*
*/



int main() 
{
	float VOLUME,pi,raio;
	pi=3.14159;
	scanf("%f",&raio);
	VOLUME = (4.0/3)*pi*(raio*raio*raio);
	printf("VOLUME = %.3f", VOLUME);
		

   return 0;
   
}
