class Solution
{
    public int integerBreak(int n)
    {
        if(n<=3)
        {
            return n-1;
        }
        int dp[] = new int[n+1];
        for(int i=1;i<=4;dp[i]=i++);
        for(int i=5;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
                dp[i]=Integer.max(dp[i],j*dp[i-j]);
            }
        }
        return dp[n];
    }
}
