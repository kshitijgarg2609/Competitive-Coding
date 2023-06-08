class Solution
{
    public int countNegatives(int[][] grid)
    {
        int c = grid[0].length;
        int cnt=0;
        for(int row[] : grid)
        {
            for(;c>0 && row[c-1]<0;c--);
            cnt+=grid[0].length-c;
        }
        return cnt;
    }
}
