class Solution
{
    public int findTheWinner(int n, int k)
    {
        Deque<Integer> dq = new LinkedList<>();
        for(int i=1;i<=n;dq.add(i++));
        for(;dq.size()>1;dq.removeFirst())
        {
            for(int i=1;i<k;i++,dq.addLast(dq.removeFirst()));
        }
        return dq.removeFirst();
    }
}
