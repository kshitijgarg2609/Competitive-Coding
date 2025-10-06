class Solution
{
    public int swimInWater(int[][] grid)
    {
        int ans=0;
        int n=grid.length;
        int dir[][] = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0])){{add(new int[]{grid[0][0],0,0});}};
        boolean vis[][] = new boolean[n][n];
        vis[0][0]=true;
        while(!pq.isEmpty())
        {
            int h=pq.peek()[0],i=pq.peek()[1],j=pq.remove()[2];
            if(i==n-1 && j==n-1)
            {
                ans=h;
                break;
            }
            for(int d[] : dir)
            {
                int in=i+d[0],jn=j+d[1];
                if(in<0 || in>=n || jn<0 || jn>=n || vis[in][jn])
                {
                    continue;
                }
                vis[in][jn]=true;
                pq.add(new int[]{Integer.max(grid[in][jn],h),in,jn});
            }
        }
        return ans;
    }
}
