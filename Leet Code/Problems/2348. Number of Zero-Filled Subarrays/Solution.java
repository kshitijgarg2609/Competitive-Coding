class Solution
{
    public long zeroFilledSubarray(int[] nums)
    {
        long cnt=0;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=0)
            {
                i++;
                continue;
            }
            long n=0;
            while(i<nums.length && nums[i]==0)
            {
                i++;
                n++;
            }
            cnt+=(n*(n+1))/2;
        }
        return cnt;
    }
}
