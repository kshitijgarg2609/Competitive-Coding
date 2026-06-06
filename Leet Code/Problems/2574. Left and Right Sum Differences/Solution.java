class Solution
{
    public int[] leftRightDifference(int[] nums)
    {
        int lr[] = new int[]{0,Arrays.stream(nums).sum()};
        return Arrays.stream(nums).map(num->Math.abs((lr[0]+=num)-num-(lr[1]-=num))).toArray();
    }
}
