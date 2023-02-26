class Solution
{
    public int countNegatives(int[][] grid)
    {
        int c=grid[0].length;
        int cnt=0;
        int indx=c-1;
        for(int r[] : grid)
        {
            while(indx>=0 && r[indx]<0)
            {
                indx--;
            }
            cnt+=c-(indx+1);
        }
        return cnt;
    }
}
