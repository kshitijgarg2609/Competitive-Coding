class Solution
{
    public long maximumHappinessSum(int[] happiness, int k)
    {
        long mx=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int h : happiness)
        {
            pq.add(h);
        }
        for(int i=0;i<k;i++)
        {
            mx+=Integer.max(pq.poll()-i,0);
        }
        return mx;
    }
}
