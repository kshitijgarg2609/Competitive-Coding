class Solution
{
    public int[] leftRightDifference(int[] nums)
    {
        int lr[] = new int[]{0,Arrays.stream(nums).sum()};
        return Arrays.stream(nums).map(num->
        {
            lr[1]-=num;
            int sum=Math.abs(lr[0]-lr[1]);
            lr[0]+=num;
            return sum;
        }).toArray();
    }
}
