#include<stdio.h>
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
	int time;
	float velocity,consumption;
	scanf("%d",&time);
	scanf("%f",&consumption);
	consumption = time *(velocity/12);
    printf("%.3f",consumption);

   return 0;
   
}
