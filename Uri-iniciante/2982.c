


#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  01/03/2020			  |
*   ----------------------------------
*
*/
					
int main(int argc, char **argv)
{

    char c;
    int i, n, x;
    long long ans = 0;
    scanf("%d%*c", &n);

    for (i = 0; i < n; ++i)
    {

        scanf("%c %d%*c", &c, &x);
        if (c == 'G')
            ans -= x;
        else
            ans += x;

    }

    if (ans >= 0)
        puts("A greve vai parar.");
    else
        puts("NAO VAI TER CORTE, VAI TER LUTA!");

    return 0;

}
