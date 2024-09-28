class MyCalendarTwo
{
    NavigableMap<Integer,Integer> tree;
    public MyCalendarTwo()
    {
        tree=new TreeMap<>();
    }
    public boolean book(int start, int end)
    {
        tree.put(start,tree.getOrDefault(start,0)+1);
        tree.put(end,tree.getOrDefault(end,0)-1);
        int sum=0;
        for(int v : tree.values())
        {
            sum+=v;
            if(sum>2)
            {
                tree.put(start,tree.get(start)-1);
                tree.put(end,tree.get(end)+1);
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
