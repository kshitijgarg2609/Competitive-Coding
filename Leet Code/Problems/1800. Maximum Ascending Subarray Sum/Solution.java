class Solution
{
    public int maxAscendingSum(int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;)
        {
            int sum=nums[i++];
            for(;i<nums.length && nums[i-1]<nums[i];sum+=nums[i++]);
            max=Integer.max(max,sum);
        }
        return max;
    }
}
