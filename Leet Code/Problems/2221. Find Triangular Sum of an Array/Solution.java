class Solution
{
    public int triangularSum(int[] nums)
    {
        for(int l=nums.length-1;l>=1;l--)
        {
            for(int i=0;i<l;i++)
            {
                nums[i]=(nums[i]+nums[i+1])%10;
            }
        }
        return nums[0];
    }
}
