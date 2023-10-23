class Solution
{
    public boolean isPowerOfFour(int n)
    {
        double lg = Math.log(n)/Math.log(4);
        return n>=1 && Math.round(lg)==lg;
    }
}
