

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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
    int n, m, ans, x, i;
    int run[200] = { 0 };

    scanf("%d %d%*c", &n, &m);

    while (n--)
        scanf("%c %d%*c", &c, &x), run[c] = x;

    ans = 0;
    scanf("%d%*c", &x);

    while (x--)
        scanf("%c%*c", &c), ans += run[c];

    printf("%d\n%s\n", ans, ans >= m ? "You shall pass!" : "My precioooous");
    
    return 0;

}
