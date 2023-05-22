#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;
void sort_by_area(triangle* tr, int n)
{
    if(n==1)
    {
        return;
    }
    int len_a=n/2;
    int len_b=n-len_a;
    sort_by_area(tr,len_a);
    sort_by_area(tr+len_a,len_b);
    int i=0,j=len_a,k=0;
    triangle mrg[n];
    while(i<len_a && j<n)
    {
        double p1=(tr[i].a+tr[i].b+tr[i].c)/2.0;
        double area1=sqrt(p1*(p1-tr[i].a)*(p1-tr[i].b)*(p1-tr[i].c));
        double p2=(tr[j].a+tr[j].b+tr[j].c)/2.0;
        double area2=sqrt(p2*(p2-tr[j].a)*(p2-tr[j].b)*(p2-tr[j].c));
        if(area1<=area2)
        {
            mrg[k++]=tr[i++];
        }
        else
        {
            mrg[k++]=tr[j++];
        }
    }
    while(i<len_a)
    {
        mrg[k++]=tr[i++];
    }
    for(i=0;i<k;i++)
    {
        tr[i]=mrg[i];
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}
