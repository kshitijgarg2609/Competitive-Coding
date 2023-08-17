class Solution
{
    public int[][] updateMatrix(int[][] mat)
    {
        int dir[][] = new int[][]{{0,-1},{-1,0},{0,1},{1,0}};
        int m=mat.length;
        int n=mat[0].length;
        int cell[][] = new int[m][n];
        boolean vis[][] = new boolean[m][n];
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    qu.add(new int[]{i,j});
                    vis[i][j]=true;
                }
            }
        }
        while(!qu.isEmpty())
        {
            int pop[] = qu.remove();
            for(int d[] : dir)
            {
                int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                if(nxt[0]>=0 && nxt[0]<m && nxt[1]>=0 && nxt[1]<n && !vis[nxt[0]][nxt[1]])
                {
                    qu.add(nxt);
                    vis[nxt[0]][nxt[1]]=true;
                    cell[nxt[0]][nxt[1]]=cell[pop[0]][pop[1]]+1;
                }
            }
        }
        return cell;
    }
}
