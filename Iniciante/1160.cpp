#include<stdio.h>

int main(){
	int PA,PB,tempo;
	float G1,G2;
	int n,casos=0;
	
	scanf("%d",&n);
	
	while(casos<n){
		scanf("%d",&PA);
		scanf("%d",&PB);
		scanf("%f",&G1);
		scanf("%f",&G2);
		tempo=0;
		while(PB>=PA && tempo<=101){
			PA=PA+(PA*G1)/100;
			PB=PB+(PB*G2)/100;
			tempo++;
		}
		
		int decada;
		if(tempo>100){
			printf("\nMais de 1 seculo.\n");
		}else{
			printf("\n%d anos.\n",tempo);
		}
	
	
		casos++;
	}
}
