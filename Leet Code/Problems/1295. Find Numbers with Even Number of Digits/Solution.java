class Solution
{
    public int findNumbers(int[] nums)
    {
        return (int)(Arrays.stream(nums).filter(n->String.valueOf(n).length()%2==0).summaryStatistics().getCount());
    }
}
