#include<stdio.h>
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  25/02/2020			  |
*   ----------------------------------
*
*/
int abs(int x) {
		if(x<0) {
			return -x;
		}else
			return x;
	}

int main() 
{
		int A,B,C,maiorAB;
		scanf("%d %d %d",&A,&B,&C);
		
		maiorAB = ((A+B)+abs(A-B))/2;
		
		if(maiorAB>C) {
			printf("%d eh o maior \n",maiorAB);
		}else
			printf("%d eh o maior \n",C);
		
 
   return 0;
   
}
