

#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  29/02/2020			  |
*   ----------------------------------
*
*/



int main(int argc, char **argv)
{


	unsigned n, m, ans = 0;
	scanf("%u", &n);
	while (n--)
	{

		scanf("%u", &m);
		if (m != 1)
			++ans;

	}

	printf("%u\n", ans);

	return 0;

}
