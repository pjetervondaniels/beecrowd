#include<stdio.h>
#include<math.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  26/02/2020			  |
*   ----------------------------------
*
*/



int main() 
{
	float x1,y1,x2,y2,distancia;
	scanf("%f %f %f %f",&x1,&y1,&x2,&y2);
    distancia = sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    printf("%.4f",distancia);
   return 0;
}
