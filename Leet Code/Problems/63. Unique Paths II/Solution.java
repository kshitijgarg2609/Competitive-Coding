class Solution
{
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int cnt[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++)
        {
            for(int j=0;j<obstacleGrid[0].length;j++)
            {
                if(i==0 && j==0 && obstacleGrid[0][0]==0)
                {
                    cnt[i][j]=1;
                }
                else if(obstacleGrid[i][j]==0)
                {
                    cnt[i][j]=((i>0)?cnt[i-1][j]:0)+((j>0)?cnt[i][j-1]:0);
                }
            }
        }
        return cnt[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
