class Solution
{
    public boolean canFinish(int numCourses, int[][] prerequisites)
    {
        List<Integer> list = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        IntStream.range(0,numCourses).forEach(x->adj.add(new ArrayList<>()));
        Queue<Integer> bfs = new LinkedList<>();
        int degree[] = new int[numCourses];
        for(int p[] : prerequisites)
        {
            adj.get(p[1]).add(p[0]);
            degree[p[0]]++;
        }
        IntStream.range(0,numCourses).forEach(x->{if(degree[x]==0) bfs.offer(x);});
        int vis=0;
        while(!bfs.isEmpty())
        {
            int node = bfs.remove();
            vis++;
            for(int n : adj.get(node))
            {
                if(--degree[n]==0)
                {
                    bfs.add(n);
                }
            }
        }
        return vis==numCourses;
    }
}
