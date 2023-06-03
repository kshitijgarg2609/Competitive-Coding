class Solution
{
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime)
    {
        List<List<Integer>> list = new ArrayList<>();
        IntStream.range(0,n).forEach(x->list.add(new ArrayList<>()));
        for(int i=0;i<n;i++)
        {
            if(i!=headID)
            {
                list.get(manager[i]).add(i);
            }
        }
        int ans=0;
        Queue<int[]> bfs = new LinkedList<>();
        bfs.add(new int[]{headID,0});
        while(!bfs.isEmpty())
        {
            int node[] = bfs.remove();
            ans=Integer.max(ans,node[1]);
            for(int adj : list.get(node[0]))
            {
                bfs.add(new int[]{adj,node[1]+informTime[node[0]]});
            }
        }
        return ans;
    }
}
