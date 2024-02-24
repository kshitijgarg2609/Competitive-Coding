class Solution
{
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson)
    {
        Map<Integer,List<int[]>> map = new TreeMap<>();
        for(int meeting[] : meetings)
        {
            map.putIfAbsent(meeting[2],new LinkedList<>());
            map.get(meeting[2]).add(new int[]{meeting[0],meeting[1]});
        }
        boolean secret[] = new boolean[n];
        secret[0]=secret[firstPerson]=true;
        for(List<int[]> nodes : map.values())
        {
            int cnt=0;
            do
            {
                cnt=0;
                for(Iterator<int[]> it=nodes.iterator();it.hasNext();)
                {
                    int node[] = it.next();
                    if(secret[node[0]] || secret[node[1]])
                    {
                        secret[node[0]]=secret[node[1]]=true;
                        cnt++;
                        it.remove();
                    }
                }
            }
            while(cnt>0 && nodes.size()>0);
        }
        return IntStream.range(0,n).filter(i->secret[i]).boxed().collect(Collectors.toList());
    }
}
