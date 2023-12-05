class Solution
{
    public int numberOfMatches(int n)
    {
        return (n==1)?0:((n/2)+numberOfMatches(n-(n/2)));
    }
}
