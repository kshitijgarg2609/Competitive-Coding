class Solution
{
    public boolean isPowerOfFour(int n)
    {
        int x=n;
        while(x>1)
        {
            if(x%4!=0)
            {
                return false;
            }
            x/=4;
        }
        return n>=1;
    }
}
