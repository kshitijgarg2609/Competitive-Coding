#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main()
{
    vector<vector<int>> vec;
    int n,q;
    cin>>n>>q;
    vec.reserve(n);
    for(int i=0;i<n;i++)
    {
        vector<int> arr;
        int k;
        cin>>k;
        arr.reserve(k);
        for(int j=0;j<k;j++)
        {
            int val;
            cin>>val;
            arr.push_back(val);
        }
        vec.push_back(arr);
    }
    for(int x=0;x<q;x++)
    {
        int i,j;
        cin>>i>>j;
        cout<<vec[i][j]<<endl;
    }
    return 0;
}
