include <stdio.h>
int main()
{
    int a,b,c,d,e,f=1,g=2,h,i=0,j=0,N,I,J;
    while(1)
    {
        scanf("%d", &N);
        if(N==0) break;
        else
        {
            int ara[N][N];
            for(a=0;  a<N; a++)
            {
                for(b=0; b<N; b++)
                    ara[a][b]=1;
            }
            I=N-1; J=N;
            for(e=0,f=1,g=2;e<I; e++)
            {
                for(c=0,d=f; d<N;d++,c++)
                    ara[c][d]=g;
                f++; g++;
            }
            for(e=0,f=1,g=2;e<I; e++)
            {
                for(c=f,d=0; c<N;d++,c++)
                    ara[c][d]=g;
                f++; g++;
            }
            for(i=0; i<N; i++)
            {
                for(j=0; j<N; j++)
                {
                    if(j==0)
                        printf("%3d",ara[i][j]);
                else printf(" %3d",ara[i][j]);
                }
                printf("\n");
            }
            printf("\n");
        }
    }
    return 0;
}

