class Solution
{
    public int longestMonotonicSubarray(int[] nums)
    {
        int max=1;
        for(int i=1,inc=1,dec=1;i<nums.length;i++)
        {
            inc=nums[i-1]<nums[i]?(inc+1):1;
            dec=nums[i-1]>nums[i]?(dec+1):1;
            max=Integer.max(max,Integer.max(inc,dec));
        }
        return max;
    }
}
