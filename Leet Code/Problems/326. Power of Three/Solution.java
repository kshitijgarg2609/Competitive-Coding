class Solution
{
    public boolean isPowerOfThree(int n)
    {
        int x=n;
        while(x>1)
        {
            if(x%3!=0)
            {
                return false;
            }
            x/=3;
        }
        return n>=1;
    }
}
