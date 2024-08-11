class Solution
{
    public int minDays(int grid[][])
    {
        if(countIsland(grid)!=1)
        {
            return 0;
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    continue;
                }
                grid[i][j]=0;
                if(countIsland(grid)!=1)
                {
                    return 1;
                }
                grid[i][j]=1;
            }
        }
        return 2;
    }
    public int countIsland(int grid[][])
    {
        int cnt=0;
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0 || vis[i][j])
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                qu.add(new int[]{i,j});
                vis[i][j]=true;
                while(!qu.isEmpty())
                {
                    int pnt[] = qu.remove();
                    for(int d[] : new int[][]{{0,1},{0,-1},{1,0},{-1,0}})
                    {
                        int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<grid.length && nxt[1]>=0 && nxt[1]<grid[0].length && !vis[nxt[0]][nxt[1]] && grid[nxt[0]][nxt[1]]==1)
                        {
                            qu.add(nxt);
                            vis[nxt[0]][nxt[1]]=true;
                        }
                    }
                }
                cnt++;
            }
        }
        return cnt;
    }
}
