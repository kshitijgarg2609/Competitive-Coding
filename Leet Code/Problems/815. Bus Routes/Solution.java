class Solution
{
    public int numBusesToDestination(int[][] routes, int source, int target)
    {
        Map<Integer,List<Integer>> adj = new HashMap<>();
        for(int i=0;i<routes.length;i++)
        {
            for(int route : routes[i])
            {
                adj.computeIfAbsent(route,val->new ArrayList<>()).add(i);
            }
        }
        Queue<int[]> bfs = new LinkedList<>(){{add(new int[]{source,0});}};
        boolean vis[] = new boolean[routes.length];
        while(!bfs.isEmpty())
        {
            int stop[] = bfs.remove();
            if(stop[0]==target)
            {
                return stop[1];
            }
            for(int bus : adj.getOrDefault(stop[0],new ArrayList<>()))
            {
                if(!vis[bus])
                {
                    vis[bus]=true;
                    for(int route : routes[bus])
                    {
                        bfs.add(new int[]{route,stop[1]+1});
                    }
                }
            }
        }
        return -1;
    }
}
