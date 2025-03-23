class Solution
{
    public int countPaths(int n, int[][] roads)
    {
        int mod=(int)(1e9+7);
        List<List<Integer>> adj = new LinkedList<>();
        IntStream.range(0,n).forEach(i->adj.add(new LinkedList<>()));
        int roadMap[][] = new int[n][n];
        long dist[] = new long[n];
        int ways[] = new int[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        ways[0]=1;
        for(int r[] : roads)
        {
            adj.get(r[0]).add(r[1]);
            adj.get(r[1]).add(r[0]);
            roadMap[r[0]][r[1]]=roadMap[r[1]][r[0]]=r[2];
        }
        PriorityQueue<long[]> bfs = new PriorityQueue<>((a,b)->Long.compare(a[1],b[1])){{add(new long[]{0L,0L});}};
        while(!bfs.isEmpty())
        {
            long node[] = bfs.remove();
            for(int x : adj.get((int)node[0]))
            {
                long d = node[1]+roadMap[(int)node[0]][x];
                if(d==dist[x])
                {
                    ways[x]=(ways[(int)node[0]]+ways[x])%mod;
                }
                else if(d<dist[x])
                {
                    ways[x]=ways[(int)node[0]];
                    dist[x]=d;
                    bfs.add(new long[]{x,d});
                }
            }
        }
        return ways[n-1];
    }
}
