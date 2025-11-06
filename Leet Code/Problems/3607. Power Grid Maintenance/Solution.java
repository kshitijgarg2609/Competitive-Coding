class Solution
{
    public int[] processQueries(int c, int[][] connections, int[][] queries)
    {
        Map<Integer,SortedSet<Integer>> idMap = new HashMap<>();
        int cMap[] = new int[c+1];
        boolean state[] = new boolean[c+1];
        for(int i=1,id=1;i<=c;i++,id++)
        {
            cMap[i]=id;
            state[i]=true;
            idMap.put(id,new TreeSet<>(Arrays.asList(i)));
        }
        for(int con[] : connections)
        {
            if(cMap[con[0]]!=cMap[con[1]])
            {
                int arr[] = (cMap[con[0]]<cMap[con[1]])?(new int[]{con[1],con[0]}):(new int[]{con[0],con[1]});
                for(int x : idMap.remove(cMap[arr[0]]))
                {
                    idMap.get(cMap[arr[1]]).add(x);
                    cMap[x]=cMap[arr[1]];
                }
                cMap[arr[0]]=cMap[arr[1]];
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int q[] : queries)
        {
            if(q[0]==1)
            {
                if(state[q[1]])
                {
                    list.add(q[1]);
                }
                else if(!idMap.get(cMap[q[1]]).isEmpty())
                {
                    list.add(idMap.get(cMap[q[1]]).first());
                }
                else
                {
                    list.add(-1);
                }
            }
            else if(q[0]==2 && state[q[1]])
            {
                state[q[1]]=false;
                idMap.get(cMap[q[1]]).remove(q[1]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
