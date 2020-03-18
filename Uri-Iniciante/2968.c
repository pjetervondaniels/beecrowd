

#include <stdio.h>

#define true 1
#define false 0

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

    int v, n, i;

    scanf("%d %d", &v, &n);

    for (i = 1; i < 10; ++i)
        printf("%d%c", (i * v * n) % 10 ? ((i * v * n) / 10) + 1 : (i * v * n) / 10, i < 9 ? ' ' : '\n');

    return 0;

}
