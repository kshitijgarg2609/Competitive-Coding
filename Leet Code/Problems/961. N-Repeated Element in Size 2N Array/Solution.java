class Solution
{
    public int repeatedNTimes(int[] nums)
    {
        int ans=0;
        outer:
        for(int i=1;i<=3;i++)
        {
            for(int j=0;j<nums.length-i;j++)
            {
                if(nums[j]==nums[i+j])
                {
                    ans=nums[j];
                    break outer;
                }
            }
        }
        return ans;
    }
}
