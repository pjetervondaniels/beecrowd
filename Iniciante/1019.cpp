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
	int N,segundos,minutos,horas;
	scanf("%d",&N);
	horas = N/3600;
	minutos = (N-(horas*60*60))/60;
	segundos= N-(horas*3600)-(minutos*60);
	printf("%d:%d:%d",horas,minutos,segundos);

   return 0;
   
}
