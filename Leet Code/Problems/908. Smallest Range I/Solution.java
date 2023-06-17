class Solution
{
    public int smallestRangeI(int[] nums, int k)
    {
        return Integer.max(0,(Arrays.stream(nums).max().getAsInt()-k)-(Arrays.stream(nums).min().getAsInt()+k));
    }
}
