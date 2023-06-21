class Solution
{
    public int findLucky(int[] arr)
    {
        int same_freq[] = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(ent->ent.getKey().intValue()==ent.getValue().intValue()).mapToInt(Map.Entry::getKey).toArray();
        return same_freq.length==0?-1:Arrays.stream(same_freq).max().getAsInt();
    }
}
