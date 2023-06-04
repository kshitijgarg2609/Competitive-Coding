class Solution
{
    public int findCircleNum(int[][] isConnected)
    {
        boolean vis[] = new boolean[isConnected.length];
        int prov=0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(vis[i])
            {
                continue;
            }
            prov++;
            vis[i]=true;
            Queue<Integer> qu = new LinkedList<>();
            qu.add(i);
            while(!qu.isEmpty())
            {
                int node=qu.remove();
                for(int j=0;j<isConnected.length;j++)
                {
                    if(!vis[j] && isConnected[node][j]==1)
                    {
                        vis[j]=true;
                        qu.add(j);
                    }
                }
            }
        }
        return prov;
    }
}
