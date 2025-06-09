class Solution
{
    public int findKthNumber(int n, int k)
    {
        int c=1;
        for(k--;k>0;)
        {
            int step=0;
            for(long x=c,y=c+1;x<=n;x*=10,y*=10)
            {
                step+=(int)(Long.min(n+1,y)-x);
            }
            if(step<=k)
            {
                c++;
                k-=step;
            }
            else
            {
                c*=10;
                k--;
            }
        }
        return c;
    }
}
