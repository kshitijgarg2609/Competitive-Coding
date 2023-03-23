class Solution
{
    public int makeConnected(int n, int[][] connections)
    {
        if(connections.length<n-1)
        {
            return -1;
        }
        List<List<Integer>> list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int arr[] : connections)
        {
            list.get(arr[0]).add(arr[1]);
            list.get(arr[1]).add(arr[0]);
        }
        int components=0;
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i])
            {
                continue;
            }
            components++;
            vis[i]=true;
            Queue<Integer> qu = new LinkedList<>();
            qu.add(i);
            while(!qu.isEmpty())
            {
                int node_pop = qu.remove();
                for(int x : list.get(node_pop))
                {
                    if(!vis[x])
                    {
                        vis[x]=true;
                        qu.add(x);
                    }
                }
            }
        }
        int req=connections.length-(n-components);
        return (req<(components-1))?-1:(components-1);
    }
}
