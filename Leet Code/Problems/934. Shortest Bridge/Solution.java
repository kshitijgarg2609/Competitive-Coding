class Solution
{
    public int shortestBridge(int[][] grid)
    {
        int n=grid.length;
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    grid[i][j]++;
                    list.add(new int[]{i,j});
                    int k=0;
                    while(k<list.size())
                    {
                        int pnt[] = list.get(k++);
                        for(int d[] : dir)
                        {
                            int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                            if(nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n && grid[nxt[0]][nxt[1]]==1)
                            {
                                list.add(nxt);
                                grid[nxt[0]][nxt[1]]++;
                            }
                        }
                    }
                    i=n;
                    j=n;
                }
            }
        }
        int min=Integer.MAX_VALUE;
        Queue<int[]> qu = new LinkedList<>(list);
        while(!qu.isEmpty())
        {
            int pnt[] = qu.remove();
            for(int d[] : dir)
            {
                int nxt[] = new int[]{pnt[0]+d[0],pnt[1]+d[1]};
                if(nxt[0]>=0 && nxt[0]<n && nxt[1]>=0 && nxt[1]<n)
                {
                    if(grid[nxt[0]][nxt[1]]==0)
                    {
                        grid[nxt[0]][nxt[1]]=grid[pnt[0]][pnt[1]]+1;
                        qu.add(nxt);
                    }
                    else if(grid[nxt[0]][nxt[1]]==1)
                    {
                        min=Integer.min(min,grid[pnt[0]][pnt[1]]-2);
                    }
                }
            }
        }
        return min;
    }
}
