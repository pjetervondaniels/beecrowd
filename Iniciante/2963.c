
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define true 1
#define false 0
#define MAXSIZE 10100

/*	
*	-----------------------------------
*	|		Pedro Daniel Jardim       |
*	| 			  UFV				  | 
*	|		  01/03/2020			  |
*   ----------------------------------
*
*/



typedef struct _placar{

    int x;
    int pos;

} placar;

placar v[MAXSIZE];

int compare(placar *a, placar *b);

int main(int argc, char **argv)
{

    int n, i;

    scanf("%d", &n);

    for (i = 0; i < n ; ++i)
        scanf("%d", &v[i].x), v[i].pos = i;

    int x = v[0].x;

    qsort(v, n, sizeof(placar), compare);

    if (v[0].pos == 0 && x == v[0].x)
        puts("S");
    else
        puts("N");
    
    return 0;

}

int compare(placar *a, placar *b)
{

    if (a->x == b->x)
        return a->pos - b->pos;

    return b->x - a->x;
    
}
