class Solution
{
    public int minCostClimbingStairs(int[] cost)
    {
        int cnt[] = new int[]{cost[0],cost[1]};
        for(int i=2;i<cost.length;i++)
        {
            cnt = new int[]{cnt[1],(Integer.min(cnt[0],cnt[1])+cost[i])};
        }
        return Integer.min(cnt[0],cnt[1]);
    }
}
