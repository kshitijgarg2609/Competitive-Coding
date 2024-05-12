class Solution
{
    public int[][] largestLocal(int[][] grid)
    {
        int dir[][] = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
        int res[][] = new int[grid.length-2][grid.length-2];
        for(int i=1;i<=res.length;i++)
        {
            for(int j=1;j<=res.length;j++)
            {
                for(int d[] : dir)
                {
                    res[i-1][j-1]=Integer.max(res[i-1][j-1],grid[i+d[0]][j+d[1]]);
                }
            }
        }
        return res;
    }
}
