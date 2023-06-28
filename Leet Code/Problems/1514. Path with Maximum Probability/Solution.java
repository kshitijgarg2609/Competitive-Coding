class Solution
{
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end)
    {
        List<List<int[]>> adj = new ArrayList<>(n);
        IntStream.range(0,n).forEach(x->adj.add(new ArrayList<>()));
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(new int[]{edges[i][1],i});
            adj.get(edges[i][1]).add(new int[]{edges[i][0],i});
        }
        Queue<Integer> qu = new LinkedList<>(){{add(start);}};
        double prob[] = new double[n];
        prob[start]=1;
        while(!qu.isEmpty())
        {
            int node=qu.remove();
            for(int arr[] : adj.get(node))
            {
                if(prob[node]*succProb[arr[1]]>prob[arr[0]])
                {
                    prob[arr[0]]=prob[node]*succProb[arr[1]];
                    qu.add(arr[0]);
                }
            }
        }
        return prob[end];
    }
}
