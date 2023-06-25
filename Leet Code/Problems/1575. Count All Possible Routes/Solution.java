class Solution
{
    public int countRoutes(int[] locations, int start, int finish, int fuel)
    {
        int mod=(int)(1e9+7);
        int dp[][] = new int[locations.length][fuel+1];
        Arrays.fill(dp[finish],1);
        for(int f=0;f<=fuel;f++)
        {
            for(int i=0;i<locations.length;i++)
            {
                for(int j=0;j<locations.length;j++)
                {
                    if(i!=j && Math.abs(locations[i]-locations[j])<=f)
                    {
                        dp[i][f]=(dp[i][f]+dp[j][f-Math.abs(locations[i]-locations[j])])%mod;
                    }
                }
            }
        }
        return dp[start][fuel];
    }
}
