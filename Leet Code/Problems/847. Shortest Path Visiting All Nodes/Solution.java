class Solution
{
    public int shortestPathLength(int[][] graph)
    {
        int short_path=Integer.MAX_VALUE;
        for(int i=0;i<graph.length;i++)
        {
            Queue<int[]> bfs = new LinkedList<>();
            Queue<BitSet> bfs_stat = new LinkedList<>();
            List<Set<BitSet>> vis = new ArrayList<>(graph.length);
            IntStream.range(0,graph.length).forEach(x->vis.add(new HashSet<>()));
            bfs.add(new int[]{i,0});
            BitSet bitset = new BitSet(graph.length);
            bitset.set(i);
            bfs_stat.add(bitset);
            while(!bfs.isEmpty())
            {
                int node[]=bfs.remove();
                BitSet node_stat=bfs_stat.remove();
                if(node_stat.cardinality()==graph.length)
                {
                    short_path=Integer.min(short_path,node[1]);
                    break;
                }
                for(int adj : graph[node[0]])
                {
                    BitSet new_stat=(BitSet)(node_stat.clone());
                    new_stat.set(adj);
                    if(!vis.get(adj).contains(new_stat))
                    {
                        bfs.add(new int[]{adj,node[1]+1});
                        bfs_stat.add(new_stat);
                        vis.get(adj).add(new_stat);
                    }
                }
            }
        }
        return short_path;
    }
}
