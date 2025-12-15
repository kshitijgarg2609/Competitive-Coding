class Solution
{
    public long getDescentPeriods(int[] prices)
    {
        long cnt=0;
        for(int i=0;i<prices.length;)
        {
            long n=1;
            for(i++;i<prices.length && prices[i-1]-prices[i]==1;i++,n++);
            cnt+=(n*(n+1))/2;
        }
        return cnt;
    }
}
