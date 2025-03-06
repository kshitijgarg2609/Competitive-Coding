class Solution
{
    public int[] findMissingAndRepeatedValues(int[][] grid)
    {
        int ans[] = new int[2];
        boolean vis[] = new boolean[grid.length*grid.length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(vis[grid[i][j]-1])
                {
                    ans[0]=grid[i][j];
                }
                vis[grid[i][j]-1]=true;
            }
        }
        ans[1]=IntStream.rangeClosed(1,vis.length).filter(num->!vis[num-1]).findFirst().getAsInt();
        return ans;
    }
}
