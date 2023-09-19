class Solution
{
    public int findDuplicate(int[] nums)
    {
        int d=0;
        for(int i=0;i<nums.length;)
        {
            if(nums[i]==i+1)
            {
                i++;
            }
            else if(nums[nums[i]-1]==nums[i])
            {
                d=nums[i];
                break;
            }
            else
            {
                d=nums[i];
                nums[i]=nums[d-1];
                nums[d-1]=d;
            }
        }
        return d;
    }
}
