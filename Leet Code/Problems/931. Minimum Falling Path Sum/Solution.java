class Solution
{
    public int minFallingPathSum(int[][] matrix)
    {
        int dp[][] = Arrays.copyOf(matrix,matrix.length);
        for(int i=matrix.length-2;i>=0;i--)
        {
            for(int j=0;j<matrix.length;j++)
            {
                int min = dp[i+1][j];
                if(j>0)
                {
                    min=Integer.min(min,dp[i+1][j-1]);
                }
                if(j<matrix.length-1)
                {
                    min=Integer.min(min,dp[i+1][j+1]);
                }
                dp[i][j]+=min;
            }
        }
        return IntStream.range(0,matrix.length).map(j->dp[0][j]).min().getAsInt();
    }
}
