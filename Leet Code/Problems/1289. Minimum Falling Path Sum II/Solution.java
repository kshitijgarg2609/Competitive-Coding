class Solution
{
    public int minFallingPathSum(int[][] grid)
    {
        int dp[] = grid[0];
        for(int r=1;r<grid.length;r++)
        {
            int g[] = grid[r];
            int nxt[] = new int[grid.length];
            Arrays.fill(nxt,Integer.MAX_VALUE);
            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid.length;j++)
                {
                    if(i==j)
                    {
                        continue;
                    }
                    nxt[j]=Integer.min(nxt[j],dp[i]+g[j]);
                }
            }
            dp=nxt;
        }
        return Arrays.stream(dp).min().getAsInt();
    }
}
