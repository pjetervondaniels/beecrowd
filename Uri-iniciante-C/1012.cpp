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
		float A,B,C,pi;
		
		pi=3.14159;
		scanf("%f %f %f",&A,&B,&C);
		
		printf("TRIANGULO:%.3f \n", (A*C)/2);
		printf("CIRCULO:%.3f\n ", pi*(C*C)) ;
		printf("TRAPEZIO: %.3f\n", ((A+B)*C)/2);
		printf("QUADRADO: %.3f\n", (B*B));
		printf("RETANGULO: %.3f\n", A*B);
 

   return 0;
   
}
