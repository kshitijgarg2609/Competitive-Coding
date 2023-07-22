class Solution
{
    public double knightProbability(int n, int k, int row, int column)
    {
        double total=1;
        int dir[][] = new int[][]{{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
        double prev[][] = new double[n][n];
        double nxt[][] = new double[n][n];
        prev[row][column]=1;
        for(int step=0;step<k;step++)
        {
            total=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(prev[i][j]==0)
                    {
                        continue;
                    }
                    for(int d[] : dir)
                    {
                        int xy[] = new int[]{i+d[0],j+d[1]};
                        if(xy[0]>=0 && xy[0]<n && xy[1]>=0 && xy[1]<n)
                        {
                            nxt[xy[0]][xy[1]]+=prev[i][j]/8.0;
                            total+=prev[i][j]/8.0;
                        }
                    }
                }
            }
            prev = nxt;
            nxt = new double[n][n];
        }
        return total;
    }
}
