class Solution
{
    public String[] uncommonFromSentences(String s1, String s2)
    {
        return Stream.concat(Arrays.stream(s1.split(" ")),Arrays.stream(s2.split(" "))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue().longValue()==1).map(Map.Entry::getKey).toArray(String[]::new);
    }
}
