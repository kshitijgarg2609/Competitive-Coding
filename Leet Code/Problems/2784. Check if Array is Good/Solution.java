class Solution
{
    public boolean isGood(int[] nums)
    {
        Arrays.sort(nums);
        int n=nums.length-1;
        return nums[n]==n && nums[n-1]==n && Arrays.stream(nums).sum()==((n*(n+1))/2)+n;
    }
}
