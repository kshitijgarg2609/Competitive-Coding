class RecentCounter
{
    int cnt;
    Queue<Integer> qu;
    public RecentCounter()
    {
        cnt=0;
        qu=new LinkedList<>();
    }
    
    public int ping(int t)
    {
        for(int lower_bound=t-3000;!qu.isEmpty() && qu.peek()<lower_bound;qu.remove());
        qu.add(t);
        return qu.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
