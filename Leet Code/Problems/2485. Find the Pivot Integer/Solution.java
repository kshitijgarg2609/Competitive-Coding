class Solution
{
    public int pivotInteger(int n)
    {
        for(int lsum=0,rsum=(n*(n+1))/2,x=1;x<=n;x++)
        {
            lsum+=x;
            if(lsum==rsum)
            {
                return x;
            }
            rsum-=x;
        }
        return -1;
    }
}
