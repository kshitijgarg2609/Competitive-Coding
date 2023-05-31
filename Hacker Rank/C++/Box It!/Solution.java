#include<bits/stdc++.h>

using namespace std;

class Box
{
    private:
        int l,b,h;
    public:
        Box() : Box(0,0,0) {}
        Box(int l,int b,int h)
        {
            this->l=l;
            this->b=b;
            this->h=h;
        }
        Box(const Box &box) : Box(box.l,box.b,box.h) {}
        long long CalculateVolume()
        {
            return (long long)l*b*h;
        }
        bool operator <(const Box &box)
        {
            return ((l<box.l)||(b<box.b && l==box.l)||(h<box.h && l==box.l && b==box.b));
        }
        friend ostream& operator <<(ostream &out,const Box &box)
        {
            return out<<box.l<<" "<<box.b<<" "<<box.h;
        }
};


void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}
