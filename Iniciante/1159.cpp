#include<stdio.h>

int main(){
	
	int x,soma,s;
	s=0;
	do{
		scanf("%d",&x);
		int i=x;
		int soma=0;
		int count=1;
		s=0;
		while(x!=0 && s<5){
			if(i%2==0){
				soma=soma+i;
				s++;
			}
			i++;
			count++;
		}
		if(x!=0){
			printf("%d \n",soma);
		}
	}while(x!=0);
	printf("\n");
	
	
	return 0;
}
