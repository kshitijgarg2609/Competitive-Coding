class Solution
{
    public int projectionArea(int[][] grid)
    {
        int n=grid.length;
        int r_max[] = new int[n];
        int c_max[] = new int[n];
        int top_view=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=0)
                {
                    r_max[i]=Integer.max(r_max[i],grid[i][j]);
                    c_max[j]=Integer.max(c_max[j],grid[i][j]);
                    top_view++;
                }
            }
        }
        return top_view+Arrays.stream(r_max).sum()+Arrays.stream(c_max).sum();
    }
}
