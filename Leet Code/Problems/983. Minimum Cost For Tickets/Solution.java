class Solution
{
    public int mincostTickets(int[] days, int[] costs)
    {
        int dp[] = new int[days.length];
        dp[0]=Integer.min(costs[0],Integer.min(costs[1],costs[2]));
        for(int i=1;i<days.length;i++)
        {
            int lst7=i;
            while(lst7>=0 && days[i]<days[lst7]+7)
            {
                lst7--;
            }
            int lst30=i;
            while(lst30>=0 && days[i]<days[lst30]+30)
            {
                lst30--;
            }
            dp[i]+=dp[i-1]+costs[0];
            dp[i]=Integer.min(dp[i],costs[1]+((lst7!=-1)?dp[lst7]:0));
            dp[i]=Integer.min(dp[i],costs[2]+((lst30!=-1)?dp[lst30]:0));
        }
        return dp[days.length-1];
    }
}
