class Solution
{
    public void moveZeroes(int[] nums)
    {
        int i=0,indx=0;
        for(;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[indx++]=nums[i];
            }
        }
        for(;indx<nums.length;indx++)
        {
            nums[indx]=0;
        }
    }
}
