class Solution
{
    public int minDays(int[] bloomDay, int m, int k)
    {
        int min=-1;
        for(int l=Arrays.stream(bloomDay).min().getAsInt(),r=Arrays.stream(bloomDay).max().getAsInt();l<=r;)
        {
            int mid=(l+r)/2;
            int bouquets_cnt=0;
            for(int i=0,consecutive=0;i<bloomDay.length;i++)
            {
                consecutive=(bloomDay[i]<=mid)?(consecutive+1):0;
                if(consecutive==k)
                {
                    bouquets_cnt++;
                    consecutive=0;
                }
            }
            if(bouquets_cnt>=m)
            {
                min=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return min;
    }
}
