class Solution
{
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k)
    {
        for(int ia=x,ib=x+k-1;ia<ib;ia++,ib--)
        {
            for(int j=y;j<y+k;j++)
            {
                int tmp=grid[ia][j];
                grid[ia][j]=grid[ib][j];
                grid[ib][j]=tmp;
            }
        }
        return grid;
    }
}
