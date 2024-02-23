class Solution
{
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k)
    {
        Map<Integer,List<int[]>> map = new HashMap<>();
        int cost[] = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]=0;
        for(int flight[] : flights)
        {
            map.putIfAbsent(flight[0],new LinkedList<>());
            map.get(flight[0]).add(new int[]{flight[1],flight[2]});
        }
        Queue<int[]> bfs = new LinkedList<>(){{add(new int[]{src,0,0});}};
        while(!bfs.isEmpty())
        {
            int pop[] = bfs.remove();
            if(pop[2]>k)
            {
                continue;
            }
            for(int adj[] : map.getOrDefault(pop[0],new LinkedList<>()))
            {
                if(cost[adj[0]]>pop[1]+adj[1])
                {
                    cost[adj[0]]=pop[1]+adj[1];
                    bfs.add(new int[]{adj[0],cost[adj[0]],pop[2]+1});
                }
            }
        }
        return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
    }
}
