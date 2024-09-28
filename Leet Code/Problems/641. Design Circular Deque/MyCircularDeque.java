class MyCircularDeque
{
    int qu[],size,f,l,cnt;
    public MyCircularDeque(int k)
    {
        qu=new int[(size=k)];
        f=l=cnt=0;
    }
    public boolean insertFront(int value)
    {
        if(isFull())
        {
            return false;
        }
        qu[f]=value;
        f=(f+1)%size;
        cnt++;
        return true;
    }
    public boolean insertLast(int value)
    {
        if(isFull())
        {
            return false;
        }
        l=(l-1+size)%size;
        qu[l]=value;
        cnt++;
        return true;
    }
    public boolean deleteFront()
    {
        if(isEmpty())
        {
            return false;
        }
        f=(f-1+size)%size;
        cnt--;
        return true;
    }
    public boolean deleteLast()
    {
        if(isEmpty())
        {
            return false;
        }
        l=(l+1)%size;
        cnt--;
        return true;
    }
    public int getFront()
    {
        if(isEmpty())
        {
            return -1;
        }
        return qu[(f-1+size)%size];
    }
    public int getRear()
    {
        if(isEmpty())
        {
            return -1;
        }
        return qu[l];
    }
    public boolean isEmpty()
    {
        return cnt==0;
    }
    public boolean isFull()
    {
        return cnt==size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
