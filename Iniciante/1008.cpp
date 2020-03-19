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
		int number,hours;
		float salary_hours;
		
		scanf("%d %d",&number,&hours);
		scanf("%f",&salary_hours);
		salary_hours=salary_hours*hours;
		
		printf("NUMBER = %d\n",number);
		printf("SALARY = U$%.2f ",salary_hours);
 

   return 0;
   
}
