class Solution
{
    public int minimizeMax(int[] nums, int p)
    {
        int ans=0;
        Arrays.sort(nums);
        for(int l=0,r=nums[nums.length-1]-nums[0];l<=r;)
        {
            int mid=(l+r)/2;
            int cnt=0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i+1]-nums[i]<=mid)
                {
                    cnt++;
                    i++;
                }
            }
            if(cnt>=p)
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
