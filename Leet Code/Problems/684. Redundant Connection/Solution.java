class Solution
{
    public int[] findRedundantConnection(int[][] edges)
    {
        int grp[] = new int[edges.length+1];
        Map<Integer,List<Integer>> map = new HashMap<>();
        int extra[] = new int[2];
        for(int edge[] : edges)
        {
            int e[] = new int[]{Integer.min(edge[0],edge[1]),Integer.max(edge[0],edge[1])};
            if(grp[e[0]]==0 && grp[e[1]]==0)
            {
                map.put(e[0],new LinkedList<>(Arrays.asList(e[0],e[1])));
                grp[e[0]]=grp[e[1]]=e[0];
            }
            else if(grp[e[0]]==0)
            {
                map.get(grp[e[1]]).add(e[0]);
                grp[e[0]]=grp[e[1]];
            }
            else if(grp[e[1]]==0)
            {
                map.get(grp[e[0]]).add(e[1]);
                grp[e[1]]=grp[e[0]];
            }
            else if(grp[e[0]]!=grp[e[1]])
            {
                for(int node : map.remove(grp[e[1]]))
                {
                    grp[node]=grp[e[0]];
                    map.get(grp[e[0]]).add(node);
                }
            }
            else
            {
                extra=edge;
                break;
            }
        }
        return extra;
    }
}
