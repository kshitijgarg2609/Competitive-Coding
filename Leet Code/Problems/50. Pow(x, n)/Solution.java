class Solution
{
    public double myPow(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 1.0/(x*myPow(x,-(n+1)));
        }
        return (myPow(x*x,n/2)*((n%2==1)?x:1));
    }
}
