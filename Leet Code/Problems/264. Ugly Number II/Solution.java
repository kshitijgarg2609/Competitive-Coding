class Solution
{
    public int nthUglyNumber(int n)
    {
        int ans=1;
        PriorityQueue<Long> pq = new PriorityQueue<>(){{add(1L);}};
        for(int i=1;i<=n;i++)
        {
            ans=pq.poll().intValue();
            for(long m : new long[]{2L,3L,5L})
            {
                if(!pq.contains(m*ans))
                {
                    pq.add(m*ans);
                }
            }
        }
        return ans;
    }
}
