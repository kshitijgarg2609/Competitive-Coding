class Solution
{
    public int firstMissingPositive(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=0;
            }
        }
        for(int num : nums)
        {
            int indx=Math.abs(num)-1;
            if(indx>=0 && indx<nums.length)
            {
                if(nums[indx]>0)
                {
                    nums[indx]*=-1;
                }
                else if(nums[indx]==0)
                {
                    nums[indx]=Integer.MIN_VALUE+1;
                }
            }
        }
        int ans=1;
        for(int num : nums)
        {
            if(num>=0)
            {
                break;
            }
            ans++;
        }
        return ans;
    }
}
