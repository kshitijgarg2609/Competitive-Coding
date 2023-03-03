class Solution
{
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {
        int i=0;
        int cnt=0;
        while(i<timeSeries.length)
        {
            int upto=timeSeries[i]+duration-1;
            int indx=i;
            int d=0;
            while(i<timeSeries.length && upto>=timeSeries[i])
            {
                upto=timeSeries[i]+duration-1;
                d=timeSeries[i]-timeSeries[indx];
                i++;
            }
            if((duration+d)>0)
            {
                cnt+=duration+d;
            }
            else
            {
                i++;
            }
        }
        return cnt;
    }
}
