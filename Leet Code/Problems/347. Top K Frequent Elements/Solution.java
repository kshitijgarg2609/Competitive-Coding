class Solution
{
    public int[] topKFrequent(int[] nums, int k)
    {
        return Arrays.copyOf(Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue())).mapToInt(a->a.getKey()).toArray(),k);
    }
}
