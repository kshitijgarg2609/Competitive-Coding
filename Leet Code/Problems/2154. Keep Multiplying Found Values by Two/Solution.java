class Solution
{
    public int findFinalValue(int[] nums, int original)
    {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for(;set.contains(original);original*=2);
        return original;
    }
}
