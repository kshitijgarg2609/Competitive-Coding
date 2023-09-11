class Solution
{
    public List<List<Integer>> groupThePeople(int[] groupSizes)
    {
        List<List<Integer>> list = new LinkedList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            if(!map.containsKey(groupSizes[i]) || map.get(groupSizes[i]).size()==groupSizes[i])
            {
                map.put(groupSizes[i],new LinkedList<>());
                list.add(map.get(groupSizes[i]));
            }
            map.get(groupSizes[i]).add(i);
        }
        return list;
    }
}
