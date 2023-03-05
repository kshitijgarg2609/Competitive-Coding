class Solution
{
    public int findLHS(int[] nums)
    {
        Map<Integer,Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        long max=0;
        for(Map.Entry<Integer,Long> ob : map.entrySet())
        {
            int next_key=ob.getKey().intValue()+1;
            if(map.containsKey(next_key))
            {
                max=Long.max(max,(ob.getValue()+map.get(next_key)));
            }
        }
        return (int)(max);
    }
}
