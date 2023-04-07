class Solution
{
    public int numEnclaves(int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        int cnt=0;
        int dir[][] = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        boolean vis[][] = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0 || vis[i][j])
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                qu.add(new int[]{i,j});
                vis[i][j]=true;
                boolean boundary=false;
                int one=0;
                while(!qu.isEmpty())
                {
                    int pop[] = qu.remove();
                    if(!boundary && (pop[0]==0 || pop[0]==m-1 || pop[1]==0 || pop[1]==n-1))
                    {
                        boundary=true;
                    }
                    one++;
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                        if(nxt[0]<0 || nxt[0]>=m || nxt[1]<0 || nxt[1]>=n || grid[nxt[0]][nxt[1]]==0 || vis[nxt[0]][nxt[1]])
                        {
                            continue;
                        }
                        qu.add(nxt);
                        vis[nxt[0]][nxt[1]]=true;
                    }
                }
                if(!boundary)
                {
                    cnt+=one;
                }
            }
        }
        return cnt;
    }
}
