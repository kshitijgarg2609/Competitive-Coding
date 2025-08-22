class Solution
{
    public int minimumArea(int[][] grid)
    {
        int w[] = new int[]{grid[0].length,0};
        int h[] = new int[]{grid.length,0};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    w=new int[]{Integer.min(w[0],j),Integer.max(w[1],j)};
                    h=new int[]{Integer.min(h[0],i),Integer.max(h[1],i)};
                }
            }
        }
        return (w[1]-w[0]+1)*(h[1]-h[0]+1);
    }
}
