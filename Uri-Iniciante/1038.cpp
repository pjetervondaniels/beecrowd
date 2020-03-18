
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
 int a, b;
  float preco;
  scanf("%hd %hd", &a, &b);

  if (a == 1)
    preco = 4.00*b;
  else if (a == 2)
    preco = 4.50*b;
  else if (a == 3)
    preco = 5.00*b;
  else if (a == 4)
    preco = 2.00*b;
  else
    preco = 1.50*b;

  printf("Total: R$ %.2f\n", preco);
 




   return 0;
   
}
