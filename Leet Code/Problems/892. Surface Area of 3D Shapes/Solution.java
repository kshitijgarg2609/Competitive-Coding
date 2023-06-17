class Solution
{
    public int surfaceArea(int[][] grid)
    {
        int surface=0;
        int n=grid.length;
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                surface+=2;
                for(int d[] : dir)
                {
                    int nxt[] = new int[]{i+d[0],j+d[1]};
                    int diff=grid[i][j]-((nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n)?grid[nxt[0]][nxt[1]]:0);
                    if(diff>0)
                    {
                        surface+=diff;
                    }
                }
            }
        }
        return surface;
    }
}
