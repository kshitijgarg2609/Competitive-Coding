class Solution
{
    public long mostPoints(int[][] questions)
    {
        int n=questions.length;
        long dp[] = new long[n];
        dp[n-1]=questions[n-1][0];
        for(int i=n-2;i>=0;i--)
        {
            int indx=i+questions[i][1]+1;
            dp[i]=Long.max(questions[i][0]+((indx<n)?dp[indx]:0),dp[i+1]);
        }
        return dp[0];
    }
}
