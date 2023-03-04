class Solution
{
    public long countSubarrays(int[] nums, int minK, int maxK)
    {
        int from=-1,min_indx=-1,max_indx=-1;
        long cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<minK || nums[i]>maxK)
            {
                from=i;
            }
            if(nums[i]==minK)
            {
                min_indx=i;
            }
            if(nums[i]==maxK)
            {
                max_indx=i;
            }
            if(Integer.min(min_indx,max_indx)>from)
            {
                cnt+=Integer.min(min_indx,max_indx)-from;
            }
        }
        return cnt;
    }
}
