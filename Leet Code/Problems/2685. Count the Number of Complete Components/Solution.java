class Solution
{
    public int countCompleteComponents(int n, int[][] edges)
    {
        boolean vis[] = new boolean[n];
        List<List<Integer>> adj = new LinkedList<>();
        IntStream.range(0,n).forEach(i->adj.add(new LinkedList<>()));
        for(int e[] : edges)
        {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i])
            {
                continue;
            }
            Queue<Integer> bfs = new LinkedList<>();
            List<Integer> list = new LinkedList<>();
            bfs.add(i);
            list.add(i);
            vis[i]=true;
            while(!bfs.isEmpty())
            {
                int node=bfs.remove();
                for(int ch : adj.get(node))
                {
                    if(vis[ch])
                    {
                        continue;
                    }
                    bfs.add(ch);
                    list.add(ch);
                    vis[ch]=true;
                }
            }
            if(list.stream().filter(node->adj.get(node).size()==list.size()-1).count()==list.size())
            {
                cnt++;
            }
        }
        return cnt;
    }
}
