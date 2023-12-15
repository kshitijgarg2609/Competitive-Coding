class Solution
{
    public int[][] onesMinusZeros(int[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        int one_r[] = new int[m];
        int one_c[] = new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                one_r[i]+=grid[i][j];
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                one_c[j]+=grid[i][j];
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                grid[i][j]=one_r[i]+one_c[j]-(m-one_r[i])-(n-one_c[j]);
            }
        }
        return grid;
    }
}
