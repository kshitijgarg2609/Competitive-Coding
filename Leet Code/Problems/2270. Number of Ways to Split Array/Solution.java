class Solution
{
    public int waysToSplitArray(int[] nums)
    {
        int cnt=0;
        long l=0,r=Arrays.stream(nums).mapToLong(Long::valueOf).sum();
        for(int i=0;i<nums.length-1;i++)
        {
            if((l+=nums[i])>=(r-=nums[i]))
            {
                cnt++;
            }
        }
        return cnt;
    }
}
