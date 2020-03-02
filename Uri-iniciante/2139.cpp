#include <stdio.h>

int main()
{
    int month, day, x, i;
    int ara[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};
    while(scanf("%d%d", &month, &day) != EOF)
    {
        if(month == 12 && day == 25) printf("E natal!\n");
        else if(month == 12 && day > 25) printf("Ja passou!\n");
        else if(month == 12 && day == 24) printf("E vespera de natal!\n");
        else
        {
            x = ara[month-1] - day;
            for(i = month; i < 12; i++)
                x += ara[i];
            printf("Faltam %d dias para o natal!\n", x);
        }
    }
    return 0;
}
