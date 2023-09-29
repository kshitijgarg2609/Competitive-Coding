class Solution
{
    public boolean isMonotonic(int[] nums)
    {
        boolean flg_inc=true;
        boolean flg_dec=true;
        for(int i=1;i<nums.length;i++)
        {
            flg_inc=(flg_inc && nums[i-1]<=nums[i]);
            flg_dec=(flg_dec && nums[i-1]>=nums[i]);
        }
        return flg_inc || flg_dec;
    }
}
