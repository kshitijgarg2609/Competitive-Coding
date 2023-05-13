#include <stdio.h>


void calculate_the_maximum(int n, int k)
{
    int and=0;
    int or=0;
    int xor=0;
    for(int a=1;a<n;a++)
    {
        for(int b=a+1;b<=n;b++)
        {
            if((a&b)>and && (a&b)<k)
            {
                and=a&b;
            }
            if((a|b)>or && (a|b)<k)
            {
                or=a|b;
            }
            if((a^b)>xor && (a^b)<k)
            {
                xor=a^b;
            }
        }
    }
    printf("%d\n%d\n%d\n",and,or,xor);
}

int main()
{
    int n, k;
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
    return 0;
}
