class Solution
{
    public int countOrders(int n)
    {
        long cnt=1,mod=(long)(1e9+7);
        for(int i=n;i>=1;cnt=(cnt*i*((2*i--)-1))%mod);
        return (int)cnt;
    }
}
