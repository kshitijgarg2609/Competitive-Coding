#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    unsigned int n,s,p,q,mod=pow(2,31), prev=s, distinct=1;
    cin>>n>>s>>p>>q;
    for(int i=1;i<n;i++)
    {
        s=(s*p+q)%mod;
        distinct+=(prev!=s);
        prev=s;
    }
    cout<<distinct<<endl;
    return 0;
}
