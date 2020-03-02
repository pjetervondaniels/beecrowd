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
	int valor,cem,cinquenta,vinte,dez,cinco,dois,um;
		
	do {
		scanf("%d",&valor);
	}while(valor<0 || valor>1000000);
		
	cem = valor/100;
	cinquenta = (valor-cem*100)/50;
	vinte=(valor-cem*100-cinquenta*50)/20;
	dez= (valor-cem*100-cinquenta*50-vinte*20)/10;
	cinco = (valor-cem*100-cinquenta*50-vinte*20-dez*10)/5;
	dois = (valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5)/2;
	um = (valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2)/1;
		
	printf("%d",valor);
	printf("%d nota(s) de R$ 100,00 \n",cem);
	printf("%d nota(s) de R$ 50,00 \n",cinquenta);
	printf("%d nota(s) de R$ 20,00 \n",vinte);
	printf("%d nota(s) de R$ 10,00 \n",dez);
    printf("%d nota(s) de R$ 5,00 \n",cinco);
    printf("%d nota(s) de R$ 2,00 \n",dois);
	printf("%d nota(s) de R$ 1,00 \n",um);

   return 0;
   
}
