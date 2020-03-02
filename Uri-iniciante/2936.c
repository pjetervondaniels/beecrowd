

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

    int vet[5] = { 300, 1500, 600, 1000, 150 };
    int n, ans, i;

    ans = 0;
    for (i = 0; i < 5; ++i)
        scanf("%d", &n), ans += n * vet[i];

    ans += 225;

    printf("%d\n", ans);


    return 0;

}
