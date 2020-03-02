#include <stdio.h>
#define true 1
#define false 0

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/

typedef unsigned short us;

int main ()
{

    char s[10];
    short ans, i, n;

    n = 3;
    while (n--)
    {

        ans = 0;
        while (scanf(" %[^\n]", s), s[0] != 'c')
            for (i = 3; i >= 0; --i)
                if (s[i] == '*')
                    ans += 1 << (2 - i);

        printf("%hd\n", ans);

    }
	
	return 0;
}
