

#include <stdio.h>

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  28/02/2020			  |
*   ----------------------------------
*
*/

int main ()
{

  unsigned short int n;

  while (scanf("%hd", &n) != EOF)
  {

    if (n == 0)
    {

      printf("vai ter copa!\n");

    }
    else
    {

      printf("vai ter duas!\n");

    }
  }
}
