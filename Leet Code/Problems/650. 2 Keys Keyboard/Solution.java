class Solution
{
    public int minSteps(int n)
    {
        int cnt=0;
        for(int div=2;n>1;div++)
        {
            for(;n%div==0;cnt+=div,n/=div);
        }
        return cnt;
    }
}
