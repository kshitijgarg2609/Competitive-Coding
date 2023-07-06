class Solution
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int min=Integer.MAX_VALUE;
        int start=0;
        int i=0;
        int sum=0;
        while(i<nums.length)
        {
            sum+=nums[i++];
            while(sum>=target)
            {
                min=Integer.min(min,i-start);
                sum-=nums[start++];
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}
