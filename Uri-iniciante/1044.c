
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
unsigned short int a, b, multi;
scanf("%hd %hd", &a, &b);

if (a > b){

  multi = a%b;
  if ( multi == 0){

    printf("Sao Multiplos\n");
  }
  else{

    printf("Nao sao Multiplos\n");

  }
}
else{

  multi = b%a;
  if (multi == 0){

    printf("Sao Multiplos\n");

  }
  else{

    printf("Nao sao Multiplos\n");

  }
}
 




   return 0;
   
}
