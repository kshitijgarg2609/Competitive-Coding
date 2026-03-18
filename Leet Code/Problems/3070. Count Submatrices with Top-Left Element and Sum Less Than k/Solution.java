class Solution
{
    public int countSubmatrices(int[][] grid, int k)
    {
        int csum[] = new int[grid[0].length];
        int cnt=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0,rsum=0;j<grid[0].length;j++)
            {
                csum[j]+=grid[i][j];
                rsum+=csum[j];
                if(rsum<=k)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
