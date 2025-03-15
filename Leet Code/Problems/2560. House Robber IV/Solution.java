class Solution
{
    public int minCapability(int[] nums, int k)
    {
        int ans=0;
        for(int l=1,r=Arrays.stream(nums).max().getAsInt();l<=r;)
        {
            int mid=(l+r)/2;
            int cnt=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<=mid)
                {
                    cnt++;
                    i++;
                }
            }
            if(cnt>=k)
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}
