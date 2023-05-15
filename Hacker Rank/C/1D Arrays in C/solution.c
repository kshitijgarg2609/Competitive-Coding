#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    int *a;
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=a[i];
    }
    free(a);
    printf("%d\n",sum);
    return 0;
}
