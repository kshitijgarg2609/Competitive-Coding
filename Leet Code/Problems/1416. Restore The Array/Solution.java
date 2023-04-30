class Solution
{
    public int numberOfArrays(String s, int k)
    {
        int mod=(int)(1E9+7);
        int dp[] = new int[s.length()+1];
        dp[s.length()]=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            long cnt=0;
            int indx=i+1;
            while(indx<=s.length() && (cnt=Long.parseLong(s.substring(i,indx)))>=1 && cnt<=k)
            {
                dp[i]=(int)((0L+dp[i]+dp[indx])%mod);
                indx++;
            }
        }
        return dp[0];
    }
}
