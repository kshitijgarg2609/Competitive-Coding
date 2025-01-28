class Solution
{
    public int findMaxFish(int[][] grid)
    {
        int m=grid.length,n=grid[0].length,sum,max=0;
        int dir[][] = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                for(qu.add(new int[]{i,j}),sum=grid[i][j],grid[i][j]=0;!qu.isEmpty();)
                {
                    int pnt[] = qu.remove();
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<m && nxt[1]>=0 && nxt[1]<n && grid[nxt[0]][nxt[1]]>0)
                        {
                            qu.add(nxt);
                            sum+=grid[nxt[0]][nxt[1]];
                            grid[nxt[0]][nxt[1]]=0;
                        }
                    }
                }
                max=Integer.max(max,sum);
            }
        }
        return max;
    }
}
