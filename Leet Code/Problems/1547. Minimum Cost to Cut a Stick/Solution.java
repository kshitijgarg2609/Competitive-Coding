class Solution
{
    public int minCost(int n, int[] cuts)
    {
        int sorted_cuts[] = IntStream.concat(IntStream.of(0,n),Arrays.stream(cuts)).sorted().toArray();
        int m=sorted_cuts.length;
        int dp[][] = new int[m][m];
        for(int d=2;d<m;d++)
        {
            for(int left=0;left<m-d;left++)
            {
                int right=left+d;
                dp[left][right]=Integer.MAX_VALUE;
                for(int mid=left+1;mid<right;mid++)
                {
                    dp[left][right]=Integer.min(dp[left][right],(sorted_cuts[right]-sorted_cuts[left]+dp[left][mid]+dp[mid][right]));
                }
            }
        }
        return dp[0][m-1];
    }
}
