class Solution
{
    public int minimumTime(int n, int[][] relations, int[] time)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        int degree[] = new int[n+1];
        for(int relation[] : relations)
        {
            map.putIfAbsent(relation[0],new ArrayList<>());
            map.get(relation[0]).add(relation[1]);
            degree[relation[1]]++;
        }
        int max_t[] = new int[n+1];
        Queue<Integer> bfs = new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            if(degree[i]==0)
            {
                bfs.add(i);
                max_t[i]=time[i-1];
            }
        }
        while(!bfs.isEmpty())
        {
            int node = bfs.remove();
            for(int adj : map.getOrDefault(node,new ArrayList<>()))
            {
                max_t[adj]=Integer.max(max_t[adj],max_t[node]+time[adj-1]);
                degree[adj]--;
                if(degree[adj]==0)
                {
                    bfs.add(adj);
                }
            }
        }
        return Arrays.stream(max_t).max().getAsInt();
    }
}
