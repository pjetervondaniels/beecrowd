
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

	int i;
	unsigned n;
	long long fibonacci[100] = { 0 };

	fibonacci[0] = 1;
	fibonacci[1]= 1;

	scanf("%u", &n);

	for (i = 2; i < n; ++i)
		fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

	for (i = n - 1; i >= 1; --i)
		printf("%lld ", fibonacci[i]);

	printf("%lld\n", fibonacci[i]);

}
