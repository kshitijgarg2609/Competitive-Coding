class Solution
{
    public int largestIsland(int[][] grid)
    {
        int max=0,n=grid.length,grpId=1;
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=1)
                {
                    continue;
                }
                Queue<int[]> bfs = new LinkedList<>();
                bfs.add(new int[]{i,j});
                grid[i][j]=++grpId;
                int cnt=1;
                while(!bfs.isEmpty())
                {
                    int pnt[] = bfs.remove();
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n && grid[nxt[0]][nxt[1]]==1)
                        {
                            grid[nxt[0]][nxt[1]]=grpId;
                            cnt++;
                            bfs.add(nxt);
                        }
                    }
                }
                map.put(grpId,cnt);
            }
        }
        if(map.values().stream().mapToInt(Integer::intValue).sum()==n*n)
        {
            return n*n;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    Set<Integer> set = new HashSet<>();
                    for(int d[] : dir)
                    {
                        int nxt[] = new int[]{i+d[0],j+d[1]};
                        if(nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n && map.containsKey(grid[nxt[0]][nxt[1]]))
                        {
                            set.add(grid[nxt[0]][nxt[1]]);
                        }
                    }
                    max=Integer.max(max,1+set.stream().mapToInt(g->map.get(g)).sum());
                }
            }
        }
        return max;
    }
}
