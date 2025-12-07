class Solution
{
    public int countOdds(int low, int high)
    {
        if(low%2==0)
        {
            return countOdds(low+1, high);
        }
        if(high%2==0)
        {
            return countOdds(low, high-1);
        }
        return 1+(high-low)/2;
    }
}
