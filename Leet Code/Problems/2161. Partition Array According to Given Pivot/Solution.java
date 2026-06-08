class Solution
{
    public int[] pivotArray(int[] nums, int pivot)
    {
        List<List<Integer>> list = new ArrayList<>();
        IntStream.range(0,3).forEach(i->list.add(new ArrayList<>()));
        for(int num : nums)
        {
            if(num<pivot)
            {
                list.get(0).add(num);
            }
            else if(num>pivot)
            {
                list.get(2).add(num);
            }
            else
            {
                list.get(1).add(num);
            }
        }
        return list.stream().flatMapToInt(l->l.stream().mapToInt(Integer::intValue)).toArray();
    }
}
