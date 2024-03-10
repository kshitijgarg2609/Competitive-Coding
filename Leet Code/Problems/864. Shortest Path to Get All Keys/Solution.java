class Solution
{
    public int shortestPathAllKeys(String[] grid)
    {
        int r=grid.length,c=grid[0].length(),key_mask=0;
        int dir[][] = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]> bfs = new LinkedList<>();
        Map<Integer,boolean[][]> vis = new HashMap<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                char ch = grid[i].charAt(j);
                if(ch=='@')
                {
                    bfs.add(new int[]{i,j,0,0});
                    vis.computeIfAbsent(0,k->new boolean[r][c])[i][j]=true;
                }
                else if(ch>='a' && ch<='z')
                {
                    key_mask|=1<<(ch-'a');
                }
            }
        }
        while(!bfs.isEmpty())
        {
            int pop[] = bfs.remove();
            for(int d[] : dir)
            {
                int nxt[] = new int[]{pop[0]+d[0],pop[1]+d[1],pop[2]+1,pop[3]};
                if(nxt[0]>=0 && nxt[0]<r && nxt[1]>=0 && nxt[1]<c)
                {
                    char ch = grid[nxt[0]].charAt(nxt[1]);
                    if(ch=='#' || (ch>='A' && ch<='Z' && (nxt[3] & 1<<(ch-'A'))==0))
                    {
                        continue;
                    }
                    else if(ch>='a' && ch<='z' && (nxt[3] & 1<<(ch-'a'))==0)
                    {
                        nxt[3]|=1<<(ch-'a');
                        if(nxt[3]==key_mask)
                        {
                            return nxt[2];
                        }
                    }
                    if(!vis.containsKey(nxt[3]) || !vis.get(nxt[3])[nxt[0]][nxt[1]])
                    {
                        bfs.add(nxt);
                        vis.computeIfAbsent(nxt[3],k->new boolean[r][c])[nxt[0]][nxt[1]]=true;
                    }
                }
            }
        }
        return -1;
    }
}
