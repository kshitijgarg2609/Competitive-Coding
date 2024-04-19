class Solution
{
    public int numIslands(char[][] grid)
    {
        int cnt=0;
        int dir[][] = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='0' || vis[i][j])
                {
                    continue;
                }
                cnt++;
                Queue<int[]> qu = new LinkedList<>();
                for(qu.add(new int[]{i,j}),vis[i][j]=true;!qu.isEmpty();)
                {
                    int pop[] = qu.remove();
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<grid.length && nxt[1]>=0 && nxt[1]<grid[0].length && grid[nxt[0]][nxt[1]]=='1' && !vis[nxt[0]][nxt[1]])
                        {
                            qu.add(nxt);
                            vis[nxt[0]][nxt[1]]=true;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
