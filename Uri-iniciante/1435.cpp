#include <stdio.h>
int main()
{
    int a,b,c,d,e,f,g,h,i,j=1,N,p=0,q=0,r;
    while(1)
    {
        scanf("%d", &N);
        if(N==0) break;
        else
        {
            j=1;p=0;q=0;
            int ara[N][N];
            i=N;
            if(N%2==0)
                r=N/2;
            else if(N%2==1)
                r=(N/2)+1;
            for(c=1; c<=r; c++)
            {
                for(a=p; a<i; a++)
                {
                    for(b=q; b<i; b++)
                        ara[a][b]=j;
                }
                j++;
                p++; q++; i--;
            }
            for(g=0; g<N; g++)
            {
                for(h=0; h<N; h++)
                {
                    if(h==0)
                        printf("%3d",ara[g][h]);
                    else printf(" %3d",ara[g][h]);
                }
                printf("\n");
            }
            printf("\n");
        }
    }
    return 0;
}
