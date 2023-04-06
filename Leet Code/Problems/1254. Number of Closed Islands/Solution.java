class Solution
{
    public int closedIsland(int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        int dir[][] = new int[][]{{0,-1},{1,0},{0,1},{-1,0}};
        boolean vis[][] = new boolean[m][n];
        int cnt=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1 || vis[i][j])
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                qu.add(new int[]{i,j});
                vis[i][j]=true;
                boolean boundary=false;
                while(!qu.isEmpty())
                {
                    int pop[] = qu.remove();
                    if(!boundary && (pop[0]==0 || pop[0]==m-1 || pop[1]==0 || pop[1]==n-1))
                    {
                        boundary=true;
                    }
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                        if(nxt[0]<0 || nxt[0]>=m || nxt[1]<0 || nxt[1]>=n || grid[nxt[0]][nxt[1]]==1 ||vis[nxt[0]][nxt[1]])
                        {
                            continue;
                        }
                        vis[nxt[0]][nxt[1]]=true;
                        qu.add(nxt);
                    }
                }
                if(!boundary)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
