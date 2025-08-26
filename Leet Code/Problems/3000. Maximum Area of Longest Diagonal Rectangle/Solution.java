class Solution
{
    public int areaOfMaxDiagonal(int[][] dimensions)
    {
        int diag=0,area=0;
        for(int d[] : dimensions)
        {
            if(((d[0]*d[0])+(d[1]*d[1]))>diag)
            {
                diag=(d[0]*d[0])+(d[1]*d[1]);
                area=d[0]*d[1];
            }
            else if(((d[0]*d[0])+(d[1]*d[1]))==diag)
            {
                area=Integer.max(area,d[0]*d[1]);
            }
        }
        return area;
    }
}
