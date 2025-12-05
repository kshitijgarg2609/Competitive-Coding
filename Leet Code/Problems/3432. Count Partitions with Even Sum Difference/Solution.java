class Solution
{
    public int countPartitions(int[] nums)
    {
        int cnt=0;
        for(int l=nums[0],r=Arrays.stream(nums).sum()-nums[0],i=1;i<nums.length;l+=nums[i],r-=nums[i],i++)
        {
            cnt+=(((l-r)%2)+1)%2;
        }
        return cnt;
    }
}
