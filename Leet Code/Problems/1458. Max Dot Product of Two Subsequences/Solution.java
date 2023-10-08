class Solution
{
    public int maxDotProduct(int[] nums1, int[] nums2)
    {
        int max1 = Arrays.stream(nums1).max().getAsInt();
        int min1 = Arrays.stream(nums1).min().getAsInt();
        int max2 = Arrays.stream(nums2).max().getAsInt();
        int min2 = Arrays.stream(nums2).min().getAsInt();
        if((max1<0 && min2>0) || (min1>0 && max2<0))
        {
            return (max1<0 && min2>0)?(max1*min2):(min1*max2);
        }
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        for(int i=nums1.length-1;i>=0;i--)
        {
            for(int j=nums2.length-1;j>=0;j--)
            {
                dp[i][j]=Integer.max((nums1[i]*nums2[j]+dp[i+1][j+1]),Integer.max(dp[i+1][j],dp[i][j+1]));
            }
        }
        return dp[0][0];
    }
}
