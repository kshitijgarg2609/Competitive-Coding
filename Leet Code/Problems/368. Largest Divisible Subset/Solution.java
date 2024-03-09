class Solution
{
    public List<Integer> largestDivisibleSubset(int[] nums)
    {
        int size=1,indx=0;
        Arrays.sort(nums);
        int dp[] = new int[nums.length];
        int lst[] = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(lst,-1);
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]%nums[j]!=0)
                {
                    continue;
                }
                if(dp[j]+1>dp[i])
                {
                    dp[i]=dp[j]+1;
                    lst[i]=j;
                    if(dp[i]>size)
                    {
                        size=dp[i];
                        indx=i;
                    }
                }
            }
        }
        List<Integer> list = new LinkedList<>();
        for(;indx!=-1;list.add(nums[indx]),indx=lst[indx]);
        return list;
    }
}
