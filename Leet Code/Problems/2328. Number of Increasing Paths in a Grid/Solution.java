class Solution
{
    public int countPaths(int[][] grid)
    {
        int mod=(int)(1e9+7);
        int dir[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int m=grid.length;
        int n=grid[0].length;
        int dp[][] = new int[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(grid[a[0]][a[1]],grid[b[0]][b[1]]));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=1;
                pq.add(new int[]{i,j});
            }
        }
        while(pq.size()>0)
        {
            int pnt[] = pq.poll();
            for(int d[] : dir)
            {
                int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                if(nxt[0]>=0 && nxt[0]<m && nxt[1]>=0 && nxt[1]<n && grid[nxt[0]][nxt[1]]>grid[pnt[0]][pnt[1]])
                {
                    dp[nxt[0]][nxt[1]]=(dp[nxt[0]][nxt[1]]+dp[pnt[0]][pnt[1]])%mod;
                }
            }
        }
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=(dp[i][j]+sum)%mod;
            }
        }
        return sum;
    }
}
