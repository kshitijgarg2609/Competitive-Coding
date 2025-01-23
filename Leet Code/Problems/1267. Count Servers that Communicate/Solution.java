class Solution
{
    public int countServers(int[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        int r_cnt[] = new int[n];
        int c_cnt[] = new int[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c_cnt[i]+=grid[i][j];
                r_cnt[j]+=grid[i][j];
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 && (c_cnt[i]>1 || r_cnt[j]>1))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
