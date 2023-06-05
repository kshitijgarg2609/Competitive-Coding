#include <iostream>
#include <vector>
#include <map>
#include <string>
#include <algorithm>
#include <set>
#include <cassert>
using namespace std;

struct Node{
   Node* next;
   Node* prev;
   int value;
   int key;
   Node(Node* p, Node* n, int k, int val):prev(p),next(n),key(k),value(val){};
   Node(int k, int val):prev(NULL),next(NULL),key(k),value(val){};
};

class Cache{
   
   protected: 
   map<int,Node*> mp; //map the key to the node in the linked list
   int cp;  //capacity
   Node* tail; // double linked list tail pointer
   Node* head; // double linked list head pointer
   virtual void set(int, int) = 0; //set function
   virtual int get(int) = 0; //get function

};

class LRUCache : Cache{
    public:
    LRUCache(int cp){
        this->cp=cp;
    }
    void set(int key, int value){
        Node *node;
        if(mp.find(key)!=mp.end()){
            node=mp[key];
            node->value=value;
            if(head==tail){
                return;
            }
            if(node->prev!=NULL){
                node->prev->next=node->next;
            }
            if(node->next!=NULL){
                node->next->prev=node->prev;
            }
        }
        else{
            node=new Node(key,value);
            mp.insert({key,node});
            if(mp.size()>cp){
                mp.erase(tail->key);
                if(tail->prev!=NULL){
                    tail=tail->prev;
                    tail->next=NULL;
                }
                else{
                    head=NULL;
                    tail=NULL;
                }
            }
        }
        if(head==NULL){
            head=tail=node;
            return;
        }
        node->next=head;
        head->prev=node;
        head=node;
    }
    int get(int key){
        return (mp.find(key)==mp.end())?-1:mp[key]->value;
    }
};

int main() {
   int n, capacity,i;
   cin >> n >> capacity;
   LRUCache l(capacity);
   for(i=0;i<n;i++) {
      string command;
      cin >> command;
      if(command == "get") {
         int key;
         cin >> key;
         cout << l.get(key) << endl;
      } 
      else if(command == "set") {
         int key, value;
         cin >> key >> value;
         l.set(key,value);
      }
   }
   return 0;
}
