class Solution
{
    public int numRollsToTarget(int n, int k, int target)
    {
        int mod=(int)(1e9+7);
        int dp[] = new int[target+1];
        int nxt[] = new int[target+1];
        for(dp[0]=1;n>0;n--)
        {
            for(int t=0;t<=target;t++)
            {
                for(int f=1;dp[t]!=0 && f<=k && f+t<=target;f++)
                {
                    nxt[f+t]=(nxt[f+t]+dp[t])%mod;
                }
            }
            dp = nxt;
            nxt = new int[target+1];
        }
        return dp[target];
    }
}
