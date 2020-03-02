

#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/



void main ()
{

    int n, i;
    int x, y;

    scanf("%d", &n);

    while (n--)
    {

        scanf("%d %d", &x, &y);

        int contador = 0;
        for (i = x; i >= y; i -= y)
            ++contador;

        printf("%d\n", contador + i);

    }

}
