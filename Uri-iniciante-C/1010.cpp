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
	int number_piece1,number_piece2,quantity_1,quantity_2;
	float price_1,price_2;	
	scanf("%d %d",&number_piece1,&quantity_1);
	scanf("%f",&price_1);
	scanf("%d %d",&number_piece2,&quantity_2);
	scanf("%f",&price_2);
    printf("VALOR A PAGAR: R$ %.2f",price_1*quantity_1+price_2*quantity_2);
 
   return 0;
   
}
