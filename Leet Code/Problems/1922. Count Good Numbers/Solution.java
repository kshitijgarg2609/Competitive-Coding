class Solution
{
    public int countGoodNumbers(long n)
    {
        long cnt=1L,mod=(long)(1e9+7);
        for(long m=20,val=n/2;val>0;m=(m*m)%mod,val/=2)
        {
            if(val%2==1)
            {
                cnt=(cnt*m)%mod;
            }
        }
        if(n%2==1)
        {
            cnt=(cnt*5)%mod;
        }
        return (int)cnt;
    }
}
