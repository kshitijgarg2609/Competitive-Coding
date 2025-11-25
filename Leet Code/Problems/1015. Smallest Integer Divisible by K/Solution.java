class Solution
{
    public int smallestRepunitDivByK(int k)
    {
        for(int i=1,r=0;i<=k;i++)
        {
            if((r=((r*10)+1)%k)==0)
            {
                return i;
            }
        }
        return -1;
    }
}
