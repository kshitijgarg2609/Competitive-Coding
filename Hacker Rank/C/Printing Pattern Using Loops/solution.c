#include <stdio.h>

int main() 
{
    int n;
    scanf("%d", &n);
    int repeat=n;
  	for(int i=1;i<(n*2);i++)
    {
        for(int j=n;j>=repeat+1;j--)
        {
            printf("%d ",j);
        }
        for(int j=1;j<(repeat*2);j++)
        {
            printf("%d ",repeat);
        }
        for(int j=repeat+1;j<=n;j++)
        {
            printf("%d ",j);
        }
        repeat+=(i<n)?-1:1;
        printf("\n");
    }
    return 0;
}
