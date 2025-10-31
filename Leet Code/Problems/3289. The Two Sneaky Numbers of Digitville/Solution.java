class Solution
{
    public int[] getSneakyNumbers(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        for(int num : nums)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
            else
            {
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
