#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    int n;
    cin>>n;
    vector<int> vec;
    vec.reserve(n);
    for(int i=0;i<n;i++)
    {
        int tmp;
        cin>>tmp;
        vec.push_back(tmp);
    }
    int q;
    cin>>q;
    for(int i=0;i<q;i++)
    {
        int val;
        cin>>val;
        vector<int>::iterator itr = lower_bound(vec.begin(),vec.end(),val);
        cout<<((*itr==val)?"Yes ":"No ")<<itr-vec.begin()+1<<endl;
    }
    return 0;
}
