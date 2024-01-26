class Solution
{
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn)
    {
        int mod=(int)(1e9+7);
        int dp[][] = new int[m][n];
        dp[startRow][startColumn]=1;
        int cnt=0;
        for(int move=1;move<=maxMove;move++)
        {
            int nxt[][] = new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(boolean flg : new boolean[]{i==0,i==m-1,j==0,j==n-1})
                    {
                        if(flg)
                        {
                            cnt=(cnt+dp[i][j])%mod;
                        }
                    }
                    for(int d[] : new int[][]{{-1,0},{1,0},{0,-1},{0,1}})
                    {
                        int pnt[] = new int[]{i+d[0],j+d[1]};
                        if(pnt[0]>=0 && pnt[0]<m && pnt[1]>=0 && pnt[1]<n)
                        {
                            nxt[pnt[0]][pnt[1]]=(nxt[pnt[0]][pnt[1]]+dp[i][j])%mod;
                        }
                    }
                }
            }
            dp=nxt;
        }
        return cnt;
    }
}
