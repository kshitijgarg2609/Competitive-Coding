class Solution
{
    public int[] findDiagonalOrder(List<List<Integer>> nums)
    {
        Map<Integer,Map<Integer,Integer>> map = new TreeMap<>();
        for(int i=0;i<nums.size();i++)
        {
            for(int j=0;j<nums.get(i).size();j++)
            {
                map.putIfAbsent((i+j),new TreeMap<>(Comparator.reverseOrder()));
                map.get(i+j).put(i,nums.get(i).get(j));
            }
        }
        return map.values().stream().flatMapToInt(mp->mp.values().stream().mapToInt(Integer::intValue)).toArray();
    }
}
