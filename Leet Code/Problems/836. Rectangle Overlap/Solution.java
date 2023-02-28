class Solution
{
    public boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
        boolean xy[] = new boolean[]{false,false};
        for(int i=0;i<2;i++)
        {
            for(int j=i;j<4;j+=2)
            {
                xy[i]=xy[i]||(rec1[j]>rec2[i] && rec1[j]<rec2[i+2]);
            }
            for(int j=i;j<4;j+=2)
            {
                xy[i]=xy[i]||(rec2[j]>rec1[i] && rec2[j]<rec1[i+2]);
            }
        }
        return xy[0] && xy[1];
    }
}
