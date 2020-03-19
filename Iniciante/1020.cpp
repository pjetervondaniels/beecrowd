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
	int dias,ano,mes,dia;
	scanf("%d",&dias);
	ano=dias/365;
	mes=(dias-ano*365)/30;
	dia=(dias-(ano*365)-(mes*30));
	printf("%d ano(s)",ano);
	printf("%d mes(es)",mes);
	printf("%d dia(s)",dia);
 

   return 0;
   
}
