#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

static int p=0;
static int s=0;

class Person{
    protected:
        string name;
        int age;
        int id;
    public:
        virtual void getdata(){}
        virtual void putdata(){}
};

class Professor : public Person{
    protected:
        int publications;
    public:
        Professor(){
            id=++p;
        }
        void getdata(){
            cin>>name>>age>>publications;
        }
        void putdata(){
            cout<<name<<" "<<age<<" "<<publications<<" "<<id<<endl;
        }
};

class Student : public Person{
    protected:
        int marks[6];
    public:
        Student(){
            id=++s;
        }
        void getdata(){
            cin>>name>>age>>marks[0]>>marks[1]>>marks[2]>>marks[3]>>marks[4]>>marks[5];
        }
        void putdata(){
            cout<<name<<" "<<age<<" "<<(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])<<" "<<id<<endl;
        }
};

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
