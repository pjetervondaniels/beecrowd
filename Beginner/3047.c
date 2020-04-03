
/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  01/03/2020			  |
*   ----------------------------------
*
*/




#include <stdio.h>

int main(int argc, char **argv)
{

    int m, a, b, x;

    scanf("%d %d %d", &m, &a, &b);
    
    x = m - a - b;

    if (x > a && x > b)
        printf("%d\n", x);
    else if (a > b && a > x)
        printf("%d\n", a);
    else
        printf("%d\n", b);

    return 0;

}
