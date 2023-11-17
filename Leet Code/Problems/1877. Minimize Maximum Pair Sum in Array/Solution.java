class Solution
{
    public int minPairSum(int[] nums)
    {
        Arrays.sort(nums);
        return IntStream.range(0,nums.length/2).map(i->nums[i]+nums[nums.length-i-1]).max().getAsInt();
    }
}
