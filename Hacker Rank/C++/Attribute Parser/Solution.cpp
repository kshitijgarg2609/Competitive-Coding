#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,q;
    cin>>n>>q;
    cin.ignore();
    vector<string> tags;
    unordered_map<string,string> mp;
    for(int i=0;i<n;i++)
    {
        string hrml;
        getline(cin,hrml);
        int k=0;
        if(hrml[0]=='<' && hrml[1]=='/')
        {
            tags.pop_back();
            continue;
        }
        string tag;
        char eq;
        stringstream ss;
        ss.str(hrml.substr(1,hrml.length()-2));
        ss>>tag;
        ss.ignore();
        tags.push_back(((tags.size()==0)?tag:(tags.back()+"."+tag)));
        while(ss)
        {
            string attr_key="";
            string attr_value="";
            ss>>attr_key>>eq>>attr_value;
            if(attr_key.length()!=0 && attr_value.length()!=0)
            {
                mp.insert({(tags.back()+"~"+attr_key),attr_value.substr(1,attr_value.length()-2)});
            }
        }
    }
    for(int i=0;i<q;i++)
    {
        string query;
        getline(cin,query);
        cout<<((mp.find(query)==mp.end())?"Not Found!":mp[query])<<endl;
    }
    return 0;
}
