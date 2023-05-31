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
        int val;
        cin>>val;
        vec.push_back(val);
    }
    int q1,q2;
    cin>>q1;
    vec.erase(vec.begin()+q1-1);
    cin>>q1>>q2;
    vec.erase(vec.begin()+q1-1,vec.begin()+q2-1);
    cout<<vec.size()<<endl;
    for(auto x=vec.begin();x!=vec.end();x++)
    {
        cout<<*x<<" ";
    }
    return 0;
}
