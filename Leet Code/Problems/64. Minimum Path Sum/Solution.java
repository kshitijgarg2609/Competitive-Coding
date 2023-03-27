class Solution
{
    public int minPathSum(int[][] grid)
    {
        int r=grid.length;
        int c=grid[0].length;
        int dir[][] = new int[][]{{0,1},{1,0}};
        int vis[][] = new int[r][c];
        for(int arr[] : vis)
        {
            Arrays.fill(arr,-1);
        }
        Queue<int[]> qu = new LinkedList<>(){{add(new int[]{0,0});}};
        vis[0][0]=grid[0][0];
        while(!qu.isEmpty())
        {
            int pnt[] = qu.remove();
            for(int p[] : dir)
            {
                int mv[] = new int[]{pnt[0]+p[0],pnt[1]+p[1]};
                if(mv[0]>=r || mv[1]>=c)
                {
                    continue;
                }
                if(vis[mv[0]][mv[1]]!=-1)
                {
                    vis[mv[0]][mv[1]]=Integer.min(vis[mv[0]][mv[1]],vis[pnt[0]][pnt[1]]+grid[mv[0]][mv[1]]);
                }
                else
                {
                    qu.add(mv);
                    vis[mv[0]][mv[1]]=vis[pnt[0]][pnt[1]]+grid[mv[0]][mv[1]];
                }
            }
        }
        return vis[r-1][c-1];
    }
}
