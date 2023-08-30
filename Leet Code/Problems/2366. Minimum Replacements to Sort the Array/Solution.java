class Solution
{
    public long minimumReplacement(int[] nums)
    {
        long cnt=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<=nums[i+1])
            {
                continue;
            }
            int n=(int)(Math.ceil(((double)(nums[i]))/nums[i+1]));
            cnt+=n-1;
            nums[i]/=n;
        }
        return cnt;
    }
}
