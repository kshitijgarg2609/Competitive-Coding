class Solution
{
    public String frequencySort(String s)
    {
        return s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue())).flatMap(ent->Stream.generate(()->ent.getKey().toString()).limit(ent.getValue())).collect(Collectors.joining());
    }
}
