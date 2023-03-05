class Solution
{
    public int minJumps(int[] arr)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            List<Integer> list = map.getOrDefault(arr[i],new ArrayList<>());
            list.add(i);
            if(list.size()==1)
            {
                map.put(arr[i],list);
            }
        }
        boolean vis[] = new boolean[arr.length];
        Queue<List<Integer>> qu = new ArrayDeque<>();
        qu.add(Arrays.asList(0,0));
        int min_steps=0;
        while(qu.size()>0)
        {
            List<Integer> pop = qu.remove();
            vis[pop.get(0)]=true;
            if(pop.get(0)==arr.length-1)
            {
                min_steps=pop.get(1);
                break;
            }
            if(map.containsKey(arr[pop.get(0)]))
            {
                for(int x : map.remove(arr[pop.get(0)]))
                {
                    if(!vis[x])
                    {
                        qu.add(Arrays.asList(x,pop.get(1)+1));
                        vis[x]=true;
                    }
                }
            }
            if(pop.get(0)-1>=0 && !vis[pop.get(0)-1])
            {
                qu.add(Arrays.asList(pop.get(0)-1,pop.get(1)+1));
                vis[pop.get(0)-1]=true;
            }
            if(pop.get(0)+1<arr.length && !vis[pop.get(0)+1])
            {
                qu.add(Arrays.asList(pop.get(0)+1,pop.get(1)+1));
                vis[pop.get(0)+1]=true;
            }
        }
        return min_steps;
    }
}
