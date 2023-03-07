class Solution
{
    public long minimumTime(int[] time, int totalTrips)
    {
        int min=Arrays.stream(time).min().getAsInt();
        long left=min-1;
        long right=1L*totalTrips*min;
        while((right-left)>1)
        {
            long mid=(left+right+1)/2;
            long trips=0;
            for(int x : time)
            {
                trips+=(mid/x);
            }
            if(totalTrips<=trips)
            {
                right=mid;
            }
            else
            {
                left=mid;
            }
        }
        return right;
    }
}
