class Solution
{
    public long distinctNames(String[] ideas)
    {
        Map<Character,Set<Integer>> map = new HashMap<>();
        for(String idea : ideas)
        {
            map.putIfAbsent(idea.charAt(0),new HashSet<>());
            map.get(idea.charAt(0)).add(idea.substring(1).hashCode());
        }
        long cnt=0;
        while(!map.isEmpty())
        {
            Iterator<Map.Entry<Character,Set<Integer>>> it = map.entrySet().iterator();
            Map.Entry<Character,Set<Integer>> e1 = it.next();
            it.remove();
            while(it.hasNext())
            {
                Map.Entry<Character,Set<Integer>> e2 = it.next();
                int c1=0,c2=0;
                for(int value : e1.getValue())
                {
                    if(!e2.getValue().contains(value))
                    {
                        c1++;
                    }
                }
                for(int value : e2.getValue())
                {
                    if(!e1.getValue().contains(value))
                    {
                        c2++;
                    }
                }
                cnt+=(2L*c1*c2);
            }
        }
        return cnt;
    }
}
