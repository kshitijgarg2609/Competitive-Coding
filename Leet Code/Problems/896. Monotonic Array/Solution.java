class Solution
{
    public boolean isMonotonic(int[] nums)
    {
        boolean flg_inc=true;
        boolean flg_dec=true;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                flg_inc=false;
            }
            if(nums[i-1]<nums[i])
            {
                flg_dec=false;
            }
        }
        return flg_inc || flg_dec;
    }
}
