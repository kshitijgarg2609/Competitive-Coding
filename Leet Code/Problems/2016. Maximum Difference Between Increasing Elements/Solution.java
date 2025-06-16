class Solution
{
    public int maximumDifference(int[] nums)
    {
        int max=-1;
        for(int i=1,j=0;i<nums.length;i++)
        {
            if(nums[i]>nums[j])
            {
                max=Integer.max(max,nums[i]-nums[j]);
            }
            else
            {
                j=i;
            }
        }
        return max;
    }
}
