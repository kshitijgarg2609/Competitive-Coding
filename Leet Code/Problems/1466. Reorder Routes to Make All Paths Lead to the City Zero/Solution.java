class Solution
{
    public int minReorder(int n, int[][] connections)
    {
        int cnt=0;
        List<List<Integer>> list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int edge[] : connections)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(-edge[0]);
        }
        boolean vis[] = new boolean[n];
        Queue<Integer> qu = new LinkedList<>(){{add(0);}};
        vis[0]=true;
        while(!qu.isEmpty())
        {
            int city=qu.remove();
            for(int x : list.get(Math.abs(city)))
            {
                if(!vis[Math.abs(x)])
                {
                    vis[Math.abs(x)]=true;
                    qu.add(x);
                    if(x>0)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
