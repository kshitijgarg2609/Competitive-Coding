class Solution
{
    public boolean judgeSquareSum(int c)
    {
        for(long a=0;(a*a)<=c;a++)
        {
            Double b = Math.sqrt(c-(a*a));
            if(b.doubleValue()==b.intValue())
            {
                return true;
            }
        }
        return false;
    }
}
