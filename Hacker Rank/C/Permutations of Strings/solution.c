#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int next_permutation(int n, char **s)
{
    int i,j;
    char *k;
    for(i=n-2;i>=0 && strcmp(s[i],s[i+1])>=0;i--);
    if(i<0)
    {
        return 0;
    }
    for(j=n-1;j>=0 && strcmp(s[i],s[j])>=0;j--);
    k=s[i];
    s[i]=s[j];
    s[j]=k;
    for(i=i+1,j=n-1;i<j;k=s[i],s[i]=s[j],s[j]=k,i++,j--);
    return 1;
}

int main()
{
	char **s;
	int n;
	scanf("%d", &n);
	s = calloc(n, sizeof(char*));
	for (int i = 0; i < n; i++)
	{
		s[i] = calloc(11, sizeof(char));
		scanf("%s", s[i]);
	}
	do
	{
		for (int i = 0; i < n; i++)
			printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
	} while (next_permutation(n, s));
	for (int i = 0; i < n; i++)
		free(s[i]);
	free(s);
	return 0;
}
