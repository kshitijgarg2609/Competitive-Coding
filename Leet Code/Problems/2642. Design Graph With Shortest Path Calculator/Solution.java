class Graph
{
    private Map<Integer,List<int[]>> map;
    public Graph(int n, int[][] edges)
    {
        map=new HashMap<>();
        for(int edge[] : edges)
        {
            addEdge(edge);
        }
    }
    
    public void addEdge(int[] edge)
    {
        map.putIfAbsent(edge[0],new ArrayList<>());
        map.get(edge[0]).add(new int[]{edge[1],edge[2]});
    }
    
    public int shortestPath(int node1, int node2)
    {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1])){{add(new int[]{node1,0});}};
        Map<Integer,Integer> cost = new HashMap<>(){{put(node1,0);}};
        while(!pq.isEmpty())
        {
            int edge[] = pq.poll();
            if(edge[1]>cost.get(edge[0]))
            {
                continue;
            }
            if(edge[0]==node2)
            {
                return edge[1];
            }
            for(int nxt_edge[] : map.getOrDefault(edge[0],new ArrayList<>()))
            {
                cost.putIfAbsent(nxt_edge[0],Integer.MAX_VALUE);
                if((nxt_edge[1]+edge[1])<cost.get(nxt_edge[0]))
                {
                    cost.put(nxt_edge[0],nxt_edge[1]+edge[1]);
                    pq.add(new int[]{nxt_edge[0],cost.get(nxt_edge[0])});
                }
            }
        }
        return -1;
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
