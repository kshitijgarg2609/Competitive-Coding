class Solution
{
    public int islandPerimeter(int[][] grid)
    {
        int dir[][] = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        int r=grid.length;
        int c=grid[0].length;
        int perimeter=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                for(int d[] : dir)
                {
                    int x=i+d[0];
                    int y=j+d[1];
                    if(x<0 || x>=r || y<0 || y>=c || grid[x][y]==0)
                    {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}
