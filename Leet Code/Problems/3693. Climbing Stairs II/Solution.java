class Solution
{
    public int climbStairs(int n, int[] costs)
    {
        int dp[] = new int[n+1];
        for(int j=1;j<=n;j++)
        {
            dp[j]=Integer.MAX_VALUE;
            for(int i=Integer.max(j-3,0);i<j;i++)
            {
                dp[j]=Integer.min(dp[j],dp[i]+costs[j-1]+((j-i)*(j-i)));
            }
        }
        return dp[n];
    }
}
