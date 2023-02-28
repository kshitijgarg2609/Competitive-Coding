class Solution
{
    public int maximumWealth(int[][] accounts)
    {
        int max=0;
        for(int arr[] : accounts)
        {
            max=Integer.max(max,Arrays.stream(arr).sum());
        }
        return max;
    }
}
