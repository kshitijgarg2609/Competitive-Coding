class Solution
{
    public List<List<Integer>> findWinners(int[][] matches)
    {
        List<List<Integer>> list = new LinkedList<>(){{add(new LinkedList<>());add(new LinkedList<>());}};
        Map<Integer,Integer> map = new TreeMap<>();
        for(int match[] : matches)
        {
            map.put(match[0],map.getOrDefault(match[0],0));
            map.put(match[1],map.getOrDefault(match[1],0)+1);
        }
        for(Map.Entry<Integer,Integer> ent : map.entrySet())
        {
            if(ent.getValue().intValue()<2)
            {
                list.get(ent.getValue()).add(ent.getKey());
            }
        }
        return list;
    }
}
