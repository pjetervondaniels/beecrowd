#include <stdio.h>
#include <string.h>

int main()
{
    int i, j, cnt = 0, cnt2, k, l;
    char sb_str[100], str[100];
    while(scanf("%s%s", sb_str, str)!=EOF)
    {
        int total = 0, sve, tmp;
        int sb_lnth = strlen(sb_str), str_lnth = strlen(str);
        for(i=0, cnt++; i <= str_lnth-sb_lnth; i++)
        {
            if(str[i] == sb_str[0])
            {
                cnt2 = 1; tmp = i + 1;
                for(k = i+1, l = 1; sb_str[l]; l++, k++)
                {
                    if(str[k] == sb_str[l]) cnt2++;
                    else break;
                }
                if(cnt2 == sb_lnth)
                {
                    total++;
                    sve = tmp;
                }
            }
        }
        printf("Caso #%d:\n", cnt);
        if(total == 0) printf("Nao existe subsequencia\n\n");
        else
        {
            printf("Qtd.Subsequencias: %d\n", total);
            printf("Pos: %d\n\n", sve);
        }
    }
    return 0;
}

