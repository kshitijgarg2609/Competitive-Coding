class Solution
{
    public int countGoodRectangles(int[][] rectangles)
    {
        int largest_side=Integer.MIN_VALUE;
        int cnt=0;
        for(int r[] : rectangles)
        {
            int max_side=Integer.min(r[0],r[1]);
            if(max_side>largest_side)
            {
                cnt=1;
                largest_side=max_side;
            }
            else if(max_side==largest_side)
            {
                cnt++;
            }
        }
        return cnt;
    }
}
