class Solution
{
    public int shortestPathBinaryMatrix(int[][] grid)
    {
        int n=grid.length;
        int dir[][] = new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        boolean vis[][] = new boolean[n][n];
        Queue<int[]> qu = new LinkedList<>();
        Queue<Integer> path = new LinkedList<>();
        if(grid[0][0]==0)
        {
            qu.add(new int[]{0,0});
            path.add(1);
            vis[0][0]=true;
        }
        while(!qu.isEmpty())
        {
            int pop[] = qu.remove();
            int dist = path.remove();
            if(pop[0]==n-1 && pop[1]==n-1)
            {
                return dist;
            }
            for(int d[] : dir)
            {
                int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                if(nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n && grid[nxt[0]][nxt[1]]==0 && !vis[nxt[0]][nxt[1]])
                {
                    vis[nxt[0]][nxt[1]]=true;
                    qu.add(nxt);
                    path.add(dist+1);
                }
            }
        }
        return -1;
    }
}
