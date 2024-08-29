class Solution
{
    public int removeStones(int[][] stones)
    {
        int possible=stones.length;
        List<List<Integer>> list = new LinkedList<>();
        for(int i=0;i<stones.length;i++)
        {
            list.add(new LinkedList<>());
        }
        for(int i=0;i<stones.length-1;i++)
        {
            for(int j=i+1;j<stones.length;j++)
            {
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1])
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        boolean vis[] = new boolean[stones.length];
        for(int i=0;i<stones.length;i++)
        {
            if(!vis[i])
            {
                vis[i]=true;
                Queue<Integer> qu = new LinkedList<>();
                qu.add(i);
                while(!qu.isEmpty())
                {
                    for(int x : list.get(qu.remove()))
                    {
                        if(!vis[x])
                        {
                            qu.add(x);
                            vis[x]=true;
                        }
                    }
                }
                possible--;
            }
        }
        return possible;
    }
}
