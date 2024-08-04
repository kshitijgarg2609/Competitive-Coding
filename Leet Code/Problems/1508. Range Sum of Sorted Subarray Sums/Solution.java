class Solution
{
    public int rangeSum(int[] nums, int n, int left, int right)
    {
        int mod = (int)(1e9+7);
        int sum[] = new int[(n*(n + 1))/2];
        for(int i=0,indx=0;i<nums.length;i++)
        {
            int cnt=0;
            for(int j=i;j<nums.length;j++)
            {
                sum[indx++]=(cnt+=nums[j]);
            }
        }
        Arrays.sort(sum);
        return (int)(IntStream.range(left-1,right).mapToLong(i->sum[i]).sum()%mod);
    }
}
