class Solution
{
    public long minSum(int[] nums1, int[] nums2)
    {
        int cnt[] = new int[2];
        long sum[] = new long[2];
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]==0)
            {
                cnt[0]++;
                nums1[i]=1;
            }
            sum[0]+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i]==0)
            {
                cnt[1]++;
                nums2[i]=1;
            }
            sum[1]+=nums2[i];
        }
        if((cnt[0]==0 && sum[0]<sum[1]) || (cnt[1]==0 && sum[1]<sum[0]))
        {
            return -1;
        }
        return Long.max(sum[0],sum[1]);
    }
}
