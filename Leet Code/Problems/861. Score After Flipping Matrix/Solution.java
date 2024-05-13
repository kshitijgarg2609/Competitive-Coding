class Solution
{
    public int matrixScore(int[][] grid)
    {
        int cnt=0;
        for(int row[] : grid)
        {
            if(row[0]==0)
            {
                for(int i=0;i<row.length;row[i]=(row[i++]+1)%2);
            }
            cnt+=1<<(row.length-1);
        }
        for(int col=1;col<grid[0].length;col++)
        {
            int zo[] = new int[2];
            for(int row=0;row<grid.length;zo[grid[row++][col]]++);
            cnt+=(Integer.max(zo[0],zo[1]))*(1<<(grid[0].length-col-1));
        }
        return cnt;
    }
}
