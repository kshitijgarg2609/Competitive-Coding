class Solution
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        Map<Integer,Long> map1 = Arrays.stream(nums1).boxed()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer,Long> map2 = Arrays.stream(nums2).boxed()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Long> ob : map1.entrySet())
        {
            if(map2.containsKey(ob.getKey()))
            {
                for(int i=0;i<Long.min(ob.getValue(),map2.get(ob.getKey()));i++)
                {
                    list.add(ob.getKey());
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
