class Solution
{
    public int makeArrayIncreasing(int[] arr1, int[] arr2)
    {
        TreeSet<Integer> tree_set = new TreeSet<>(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
        Map<Integer,Integer> map = new HashMap<>(){{put(-1,0);}};
        for(int i=0;i<arr1.length;i++)
        {
            Set<Map.Entry<Integer,Integer>> set = new HashSet<>(map.entrySet());
            map.clear();
            for(Map.Entry<Integer,Integer> ob : set)
            {
                if(arr1[i]>ob.getKey())
                {
                    map.put(arr1[i],Integer.min(map.getOrDefault(arr1[i],Integer.MAX_VALUE),ob.getValue()));
                }
                Integer h=tree_set.higher(ob.getKey());
                if(h!=null)
                {
                    map.put(h,Integer.min(map.getOrDefault(h,Integer.MAX_VALUE),ob.getValue()+1));
                }
            }
        }
        int min=map.size()==0?Integer.MAX_VALUE:map.entrySet().stream().mapToInt(Map.Entry::getValue).min().getAsInt();
        return min==Integer.MAX_VALUE?-1:min;
    }
}
