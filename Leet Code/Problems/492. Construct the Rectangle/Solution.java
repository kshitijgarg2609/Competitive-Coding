class Solution
{
    public int[] constructRectangle(int area)
    {
        if(area==1 || area==2)
        {
            return new int[]{area,1};
        }
        int lb[] = new int[2];
        for(int i=2;i<=Math.sqrt(area);i++)
        {
            if(area%i==0)
            {
                if(i>(area/i))
                {
                    break;
                }
                lb[0]=area/i;
                lb[1]=i;
            }
        }
        return (lb[0]==0)?(new int[]{area,1}):(lb);
    }
}
