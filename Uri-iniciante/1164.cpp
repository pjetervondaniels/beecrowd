#include<stdio.h>

int main(){
	
	int n,casos=0;
	int p,i;
	scanf("%d",&n);
	
	do{
		scanf("%d",&p);
		int soma=0;
		i=0;
		while(p>i){
			
			if(p%i==0){
				printf("%d",i);
				soma=soma+i;
			}
			printf("%d",i);
			i++;
		}
		
		if(soma==p){
			printf("%d eh perfeito",p);
		}else{
			printf("%d nao eh perfeito",p);
		}
		
		casos++;
	}while(casos<n);
	

}
