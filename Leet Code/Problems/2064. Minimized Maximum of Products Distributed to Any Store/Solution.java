class Solution
{
    public int minimizedMaximum(int n, int[] quantities)
    {
        int l=1,r=Arrays.stream(quantities).max().getAsInt(),x=r;
        while(l<=r)
        {
            int mid=(l+r)/2;
            int cnt=0;
            for(int q : quantities)
            {
                cnt+=(int)(Math.ceil((1.0*q)/mid));
            }
            if(cnt>n)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
                x=mid;
            }
        }
        return x;
    }
}
