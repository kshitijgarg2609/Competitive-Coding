class Solution
{
    public int maximumDetonation(int[][] bombs)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<bombs.length;i++)
        {
            for(int j=0;j<bombs.length;j++)
            {
                if(i==j || (Math.pow(bombs[i][0]-bombs[j][0],2)+Math.pow(bombs[i][1]-bombs[j][1],2))>Math.pow(bombs[i][2],2))
                {
                    continue;
                }
                List<Integer> list = map.getOrDefault(i,new LinkedList<>());
                list.add(j);
                if(list.size()==1)
                {
                    map.put(i,list);
                }
            }
        }
        int cnt,max=0;
        for(int i=0;i<bombs.length;i++)
        {
            boolean vis[] = new boolean[bombs.length];
            Queue<Integer> qu = new LinkedList<>();
            for(cnt=0,vis[i]=true,qu.add(i);!qu.isEmpty();cnt++)
            {
                int node=qu.remove();
                for(int adj : map.getOrDefault(node,new LinkedList<>()))
                {
                    if(!vis[adj])
                    {
                        vis[adj]=true;
                        qu.add(adj);
                    }
                }
            }
            max=Integer.max(max,cnt);
        }
        return max;
    }
}
