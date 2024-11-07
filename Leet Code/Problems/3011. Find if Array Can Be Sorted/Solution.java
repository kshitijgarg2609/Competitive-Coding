class Solution
{
    public boolean canSortArray(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int j=i,cnt=Integer.bitCount(nums[i++]);
            for(;i<nums.length && cnt==Integer.bitCount(nums[i]);i++);
            Arrays.sort(nums,j,i);
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                return false;
            }
        }
        return true;
    }
}
