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
    std::sort(vec.begin(),vec.end());
    for(auto x=vec.begin();x!=vec.end();x++)
    {
        cout<<*x<<" ";
    }
    return 0;
}
