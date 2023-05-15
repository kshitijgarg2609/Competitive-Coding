#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int main()
{
    char str[1000];
    scanf("%[^\n]%*c",str);
    int *freq = (int*)malloc(10*sizeof(freq));
    for(int i=0;i<strlen(str);i++)
    {
        if(isdigit(str[i]))
        {
            freq[str[i]-'0']++;
        }
    }
    for(int i=0;i<10;i++)
    {
        printf("%d ",freq[i]);
    }
    return 0;
}
