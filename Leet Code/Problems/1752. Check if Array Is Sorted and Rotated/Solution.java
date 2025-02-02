class Solution
{
    public boolean check(int[] nums)
    {
        int inv=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[(i+nums.length-1)%nums.length]>nums[i])
            {
                inv++;
            }
        }
        return inv<=1;
    }
}
