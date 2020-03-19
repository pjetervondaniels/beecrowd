




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

    char gen;
    int n, c, b;
    char string[100];

    scanf("%d", &n);

    b = c = 0;
    while (n--)
    {

        scanf("%s%*c%c", string, &gen);

        if (gen == 'F')
            ++b;
        else
            ++c;

    }

    printf("%d carrinhos\n%d bonecas\n", c, b);

    return 0;

}
