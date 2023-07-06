class Solution
{
    public int rob(int[] nums)
    {
        for(int i=nums.length-1;i>=0;i--)
        {
            nums[i]+=Integer.max((((i+2)<nums.length)?nums[i+2]:0),(((i+3)<nums.length)?nums[i+3]:0));
        }
        return Integer.max(nums[0],(nums.length>1?nums[1]:0));
    }
}
