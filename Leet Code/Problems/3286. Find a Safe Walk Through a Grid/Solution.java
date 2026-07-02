class Solution
{
    public boolean findSafeWalk(List<List<Integer>> grid, int health)
    {
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        int m=grid.size(),n=grid.get(0).size();
        boolean vis[][] = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[2],a[2]));
        pq.add(new int[]{0,0,health-grid.get(0).get(0)});
        vis[0][0]=true;
        while(!pq.isEmpty())
        {
            int xyc[] = pq.remove();
            if(xyc[2]==0)
            {
                continue;
            }
            if(xyc[0]==m-1 && xyc[1]==n-1)
            {
                return true;
            }
            for(int d[] : dir)
            {
                int x=xyc[0]+d[0],y=xyc[1]+d[1];
                if(x<0 || y<0 || x>=m || y>=n || vis[x][y])
                {
                    continue;
                }
                vis[x][y]=true;
                int c=xyc[2]-grid.get(x).get(y);
                if(c>0)
                {
                    pq.add(new int[]{x,y,c});
                }
            }
        }
        return false;
    }
}
