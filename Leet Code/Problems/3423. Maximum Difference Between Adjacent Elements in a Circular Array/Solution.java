class Solution
{
    public int maxAdjacentDistance(int[] nums)
    {
        return IntStream.range(0,nums.length).map(i->Math.abs(nums[i]-nums[(i+1)%nums.length])).max().getAsInt();
    }
}
