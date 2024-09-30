class CustomStack
{
    int stack[],indx;
    public CustomStack(int maxSize)
    {
        stack=new int[maxSize];
        indx=0;
    }
    
    public void push(int x)
    {
        if(indx<stack.length)
        {
            stack[indx++]=x;
        }
    }
    
    public int pop()
    {
        return (indx==0)?-1:stack[--indx];
    }
    
    public void increment(int k, int val)
    {
        for(int i=0;i<Integer.min(k,indx);stack[i++]+=val);
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
