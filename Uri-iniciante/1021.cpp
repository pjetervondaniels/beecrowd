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
	int valor,cem,cinquenta,vinte,dez,cinco,dois,um,m_cinquenta,m_vinte,m_dez,m_cinco,m_um;
		
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
	m_cinquenta= (int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1)/0.50);
	m_vinte=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50)/0.25);
	m_dez=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25)/0.10);
	m_cinco=(int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25-m_dez*0.10)/0.05);
	m_um = (int) ((valor-cem*100-cinquenta*50-vinte*20-dez*10-cinco*5-dois*2-um*1-m_cinquenta*0.50-m_vinte*0.25-m_dez*0.10-m_cinco*0.05)/0.01);
	
	printf("%d",valor);
	printf("%d nota(s) de R$ 100,00 \n",cem);
	printf("%d nota(s) de R$ 50,00 \n",cinquenta);
	printf("%d nota(s) de R$ 20,00 \n",vinte);
	printf("%d nota(s) de R$ 10,00 \n",dez);
    printf("%d nota(s) de R$ 5,00 \n",cinco);
    printf("%d nota(s) de R$ 2,00 \n",dois);
	printf("%d nota(s) de R$ 1,00 \n",um);
	printf("MOEDAS:\n");
	printf("%d moeda(s) de R$ 1.00 \n",um);
	printf("%d moeda(s) de R$ 0.50 \n",m_cinquenta);
	printf("%d moeda(s) de R$ 0.25 \n",m_vinte);
	printf("%d moeda(s) de R$ 0.10 \n",m_dez);
	printf("%d moeda(s) de R$ 0.05 \n",m_cinco);
	printf("%d moeda(s) de R$ 0.01 \n",m_um);
	
   return 0;
   
}
