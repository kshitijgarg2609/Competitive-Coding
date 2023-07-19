class Solution
{
    public int eraseOverlapIntervals(int[][] intervals)
    {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[1]));
        int cnt=0,current_time=Integer.MIN_VALUE;
        for(int intvl[] : intervals)
        {
            if(intvl[0]>=current_time)
            {
                current_time=intvl[1];
                continue;
            }
            cnt++;
        }
        return cnt;
    }
}
