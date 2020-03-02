#include <stdio.h>

int main()
{
    char name[600];
    gets(name);
    printf((strlen(name)>80)?"NO\n":"YES\n");
    return 0;
}
