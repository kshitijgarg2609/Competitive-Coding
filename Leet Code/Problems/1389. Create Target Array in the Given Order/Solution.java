class Solution
{
    public int[] createTargetArray(int[] nums, int[] index)
    {
        List<Integer> list = new ArrayList<>();
        IntStream.range(0,nums.length).forEach(i->list.add(index[i],nums[i]));
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
