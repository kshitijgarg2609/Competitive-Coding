class Solution
{
    public int minCost(int[][] grid)
    {
        int m=grid.length,n=grid[0].length;
        int mat[][] = new int[m][n];
        int dir[][] = new int[][]{{0,1,1},{0,-1,2},{1,0,3},{-1,0,4}};
        for(int arr[] : mat)
        {
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        Deque<int[]> dq = new LinkedList<>();
        for(dq.add(new int[]{0,0}),mat[0][0]=0;!dq.isEmpty();)
        {
            int nxt[] = dq.remove();
            for(int d[] : dir)
            {
                int pnt[] = new int[]{nxt[0]+d[0],nxt[1]+d[1]};
                int cost=grid[nxt[0]][nxt[1]]==d[2]?0:1;
                if(pnt[0]>=0 && pnt[0]<m && pnt[1]>=0 && pnt[1]<n && mat[nxt[0]][nxt[1]]+cost<mat[pnt[0]][pnt[1]])
                {
                    mat[pnt[0]][pnt[1]]=mat[nxt[0]][nxt[1]]+cost;
                    if(cost==0)
                    {
                        dq.addFirst(pnt);
                    }
                    else
                    {
                        dq.add(pnt);
                    }
                }
            }
        }
        return mat[m-1][n-1];
    }
}
