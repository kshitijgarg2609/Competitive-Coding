class Solution
{
    public long countSubarrays(int[] nums, int k)
    {
        long cnt=0L;
        int max=Arrays.stream(nums).max().getAsInt();
        for(int i=0,j=0,mx_cnt=0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                mx_cnt++;
            }
            while(mx_cnt>=k)
            {
                cnt+=0L+nums.length-i;
                if(nums[j++]==max)
                {
                    mx_cnt--;
                }
            }
        }
        return cnt;
    }
}
