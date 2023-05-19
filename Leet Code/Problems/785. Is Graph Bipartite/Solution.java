class Solution
{
    public boolean isBipartite(int[][] graph)
    {
        int color[] = new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(color[i]!=0)
            {
                continue;
            }
            Queue<Integer> qu = new LinkedList<>();
            qu.add(i);
            color[i]=1;
            while(!qu.isEmpty())
            {
                int pop=qu.remove();
                for(int adj : graph[pop])
                {
                    if(color[adj]==color[pop])
                    {
                        return false;
                    }
                    if(color[adj]==0)
                    {
                        color[adj]-=color[pop];
                        qu.add(adj);
                    }
                }
            }
        }
        return true;
    }
}
