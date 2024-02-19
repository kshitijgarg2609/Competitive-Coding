class Solution
{
    public boolean isPowerOfTwo(int n)
    {
        for(;n>0 && (n%2)==0;n/=2);
        return n==1;
    }
}
