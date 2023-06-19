class Solution
{
    public boolean uniqueOccurrences(int[] arr)
    {
        Set<Long> set = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).values());
        return set.size()==1 && set.contains(1L);
    }
}
