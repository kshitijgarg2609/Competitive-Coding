class Solution
{
    public int sumBase(int n, int k)
    {
        int cnt=0;
        while(n>0)
        {
            cnt+=n%k;
            n/=k;
        }
        return cnt;
    }
}
