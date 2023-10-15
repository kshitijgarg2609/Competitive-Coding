class Solution
{
    public int numWays(int steps, int arrLen)
    {
        long mod = (long)(1e9+7);
        arrLen=Integer.min(arrLen,steps);
        long dp[] = new long[arrLen];
        dp[0]=1;
        for(int r=1;r<=steps;r++)
        {
            long nxt[] = new long[arrLen];
            for(int i=arrLen-1;i>=0;i--)
            {
                nxt[i]=((((i-1)>=0)?dp[i-1]:0)+dp[i]+(((i+1)<arrLen)?dp[i+1]:0))%mod;
            }
            dp=nxt;
        }
        return (int)dp[0];
    }
}
