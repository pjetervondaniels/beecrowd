



#include <stdio.h>
#include <ctype.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  28/02/2020			  |
*   ----------------------------------
*
*/

void imprimeCpf(char *, char *);

int main ()
{

	char cpf[15], saida[15], i;

	scanf("%s", cpf);

	imprimeCpf(cpf, saida);

	for (i = 0; saida[i]; i++)
	{
		if (i != 0 && i % 3 == 0)
			printf("\n");
		printf("%c", saida[i]);
	}
	printf("\n");

	return 0;
	
}

void imprimeCpf(char *str, char *saida)
{

	while (isdigit(*str))
		*(saida++) = *(str++);

	str++;
	while (isdigit(*str))
		*(saida++) = *(str++);

	str++;

	while (isdigit(*str))
		*(saida++) = *(str++);

	str++;

	while (isdigit(*str))
		*(saida++) = *(str++);

	*saida = '\0';

}
