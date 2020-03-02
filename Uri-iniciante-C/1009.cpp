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
	char name[100];
	float fix_salary,sales_done;
	scanf("%s",name);
	scanf("%f %f",&fix_salary,&sales_done);
	fix_salary=fix_salary+(sales_done*0.15);
	printf("TOTAL = R$ %.2f",fix_salary);
   return 0;
   
}
