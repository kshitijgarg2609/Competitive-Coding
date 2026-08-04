class Solution
{
    public List<Integer> findMissingElements(int[] nums)
    {
        Arrays.sort(nums);
        return IntStream.range(0,nums.length-1).filter(i->nums[i+1]-nums[i]>1).flatMap(i->IntStream.range(nums[i]+1,nums[i+1])).boxed().collect(Collectors.toList());
    }
}
