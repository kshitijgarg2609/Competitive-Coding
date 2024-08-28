class Solution
{
    public int countSubIslands(int[][] grid1, int[][] grid2)
    {
        int cnt=0;
        for(int i=0;i<grid2.length;i++)
        {
            for(int j=0;j<grid2[0].length;j++)
            {
                if(grid2[i][j]==0)
                {
                    continue;
                }
                Queue<int[]> qu = new LinkedList<>();
                qu.add(new int[]{i,j});
                grid2[i][j]=0;
                int match=0;
                for(;!qu.isEmpty();match++)
                {
                    int pop[] = qu.remove();
                    if(grid1[pop[0]][pop[1]]==1)
                    {
                        match--;
                    }
                    for(int d[] : new int[][]{{0,1},{0,-1},{1,0},{-1,0}})
                    {
                        int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1]};
                        if(nxt[0]>=0 && nxt[0]<grid2.length && nxt[1]>=0 && nxt[1]<grid2[0].length && grid2[nxt[0]][nxt[1]]==1)
                        {
                            qu.add(nxt);
                            grid2[nxt[0]][nxt[1]]=0;
                        }
                    }
                }
                cnt+=(match==0)?1:0;
            }
        }
        return cnt;
    }
}
