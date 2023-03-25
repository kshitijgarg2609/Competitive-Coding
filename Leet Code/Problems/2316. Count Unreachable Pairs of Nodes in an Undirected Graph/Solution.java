class Solution
{
    public long countPairs(int n, int[][] edges)
    {
        List<List<Integer>> list = new ArrayList<>(n);
        IntStream.range(0,n).forEach(x->list.add(new ArrayList<>()));
        for(int edge[] : edges)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        long cnt=0;
        long remaining=n;
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i])
            {
                continue;
            }
            Queue<Integer> qu = new LinkedList<>();
            int nodes=1;
            qu.add(i);
            vis[i]=true;
            while(!qu.isEmpty())
            {
                int node_pop=qu.remove();
                for(int x : list.get(node_pop))
                {
                    if(!vis[x])
                    {
                        nodes++;
                        qu.add(x);
                        vis[x]=true;
                    }
                }
            }
            remaining-=nodes;
            cnt+=remaining*nodes;
        }
        return cnt;
    }
}
