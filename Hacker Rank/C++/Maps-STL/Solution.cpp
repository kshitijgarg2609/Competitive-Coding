#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;

int main()
{
    int q;
    cin>>q;
    map<string,int> mp;
    for(int i=0;i<q;i++)
    {
        int qu;
        cin>>qu;
        string key;
        int val;
        switch(qu)
        {
            case 1:
            {
                cin>>key>>val;
                if(mp.find(key)==mp.end())
                {
                    mp.insert({key,0});
                }
                mp[key]+=val;
                break;
            }
            case 2:
            {
                cin>>key;
                mp.erase(key);
                break;
            }
            case 3:
            {
                cin>>key;
                map<string,int>::iterator itr = mp.find(key);
                cout<<((itr!=mp.end())?itr->second:0)<<endl;
                break;
            }
        }
    } 
    return 0;
}
