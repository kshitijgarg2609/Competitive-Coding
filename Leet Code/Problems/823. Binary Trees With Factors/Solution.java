class Solution
{
    public int numFactoredBinaryTrees(int[] arr)
    {
        long mod = (long)(1e9+7);
        Arrays.sort(arr);
        long dp[] = new long[arr.length];
        long cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if((arr[i]%arr[j])==0)
                {
                    int k=Arrays.binarySearch(arr,0,i,arr[i]/arr[j]);
                    if(k>=0)
                    {
                        dp[i]=(dp[i]+((dp[j]*dp[k])%mod))%mod;
                    }
                }
            }
            cnt=(cnt+dp[i])%mod;
        }
        return (int)(cnt);
    }
}
