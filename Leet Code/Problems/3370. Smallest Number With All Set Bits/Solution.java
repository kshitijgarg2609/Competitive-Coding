class Solution
{
    public int smallestNumber(int n)
    {
        int x=1;
        for(;x<n;x=(2*x)+1);
        return x;
    }
}
