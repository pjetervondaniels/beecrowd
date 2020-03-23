#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  22/03/2020			  |
*   ----------------------------------
*
*/



int main (){
    int p,s,i,caso=1,vetor[100];
    scanf("%d %d",&p,&s);
    while(p!=0 && s!=0){
        int i=0;
        int x=0,y=1,booleano=0;
        while(i<s)
        {
            scanf("%d %d",&vetor[x],&vetor[y]);
            x+=2;
            y+=2;
            i++;
        }
        i=0;
        int menor=vetor[0];
        int t = s*2;
        while(i<t)
        {
            if(vetor[i]==p){
                booleano=1;
            }

            if(vetor[i]<menor){
                menor=vetor[i];
            }

            i++;
        }

        if(booleano==0)
        {
            printf("\n TESTE %d \n",caso);
            int x=0,y=1;
            for ( i = 0; i < s; i++)
            {
                printf("%d %d \n",vetor[x],vetor[y]);
                x+=2;
                y+=2;
            }
            printf("\n");
            
        }
        if(booleano==1){
            printf("\n TESTE %d \n",caso);
            printf("%d %d \n",menor,p);
            printf("\n");
        }
        scanf("%d %d",&p,&s);
        caso++;
    }

    return 0;

}
