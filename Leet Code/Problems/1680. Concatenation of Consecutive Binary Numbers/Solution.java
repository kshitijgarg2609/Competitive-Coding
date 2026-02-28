class Solution
{
    public int concatenatedBinary(int n)
    {
        long mod=(long)(1e9+7);
        long cnt=1L;
        for(int i=2;i<=n;i++)
        {
            cnt=((cnt<<Integer.toBinaryString(i).length())|i)%mod;
        }
        return (int)cnt;
    }
}
