#include <stdio.h>
#include <string.h>
int main()
{
    long long int decimal;
    char hexa[20];
    scanf("%lld", &decimal);
    long int i=0, mod, j, lnth;
    
    while(decimal>0) {
        mod = decimal % 16;
        decimal /= 16;
        if(mod<=9)
            hexa[i] = mod+48;
        else if(mod==10)
            hexa[i] = 'A';
        else if(mod==11)
            hexa[i] = 'B';
        else if(mod==12)
            hexa[i] = 'C';
        else if(mod==13)
            hexa[i] = 'D';
        else if(mod==14)
            hexa[i] = 'E';
        else if(mod==15)
            hexa[i] = 'F';
        i++;
    }
    
    hexa[i] = '\0';
    
    lnth = strlen(hexa);
    
    for(j = lnth-1; j>=0; j--){
    	printf("%c", hexa[j]);
	}
        
    printf("\n");
    return 0;
}
