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
    int A,B,C,D;
	scanf("%d %d %d %d",&A,&B,&C,&D);
	if( (B>C)&&(D>A)&&(C+D>A+B)&&(C>=0)&&(D>=0)&&(A%2==0)) {
		printf("Valores aceitos");
	}else{
		printf("Valores nao aceitos");
	}
   return 0;
}
