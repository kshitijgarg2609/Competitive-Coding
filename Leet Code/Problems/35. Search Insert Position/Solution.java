class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        if(target<=nums[0] || target>nums[nums.length-1])
        {
            return (target<=nums[0])?0:nums.length;
        }
        int left=0;
        int right=nums.length-1;
        while((right-left)>1)
        {
            int mid=(left+right+1)/2;
            if(target<=nums[mid])
            {
                right=mid;
            }
            else if(target>nums[mid])
            {
                left=mid;
            }
        }
        return right;
    }
}
