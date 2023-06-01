#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

int main()
{
    int q;
    cin>>q;
    set<int> st;
    for(int i=0;i<q;i++)
    {
        int qu,val;
        cin>>qu>>val;
        switch (qu)
        {
            case 1:
            {
                st.insert(val);
                break;
            }
            case 2:
            {
                st.erase(val);
                break;
            }
            case 3:
            {
                cout<<((st.find(val)!=st.end())?"Yes":"No")<<endl;
                break;
            }
        }
    }
    return 0;
}
