class Solution
{
    public boolean findRotation(int[][] mat, int[][] target)
    {
        int n=mat.length;
        boolean clockwise_0=true;
        boolean clockwise_90=true;
        boolean clockwise_180=true;
        boolean clockwise_270=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                clockwise_0=clockwise_0 && mat[i][j]==target[i][j];
                clockwise_90=clockwise_90 && mat[i][j]==target[j][n-i-1];
                clockwise_180=clockwise_180 && mat[i][j]==target[n-i-1][n-j-1];
                clockwise_270=clockwise_270 && mat[i][j]==target[n-j-1][i];
            }
        }
        return clockwise_0 || clockwise_90 || clockwise_180 || clockwise_270;
    }
}
