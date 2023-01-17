class Solution
{
    public int[] countBits(int n)
    {
        int one[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                one[i]=one[i-1]+1;
            }
            else if(i%2==0 && one[i/2]==1)
            {
                one[i]=1;
            }
            else
            {
                one[i]=one[i/2];
            }
        }
        return one;
    }
}
