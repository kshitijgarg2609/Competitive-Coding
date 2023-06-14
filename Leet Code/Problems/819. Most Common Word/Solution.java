class Solution
{
    public String mostCommonWord(String paragraph, String[] banned)
    {
        String str = paragraph.replaceAll("[^A-Za-z0-9]"," ");
        Map<String,Long> map = Arrays.stream(str.split("\\s+")).map(x->x.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Set<String> set = Arrays.stream(banned).collect(Collectors.toSet());
        long freq=0;
        for(Map.Entry<String,Long> ob : map.entrySet())
        {
            if(!set.contains(ob.getKey()) && ob.getValue()>freq)
            {
                freq=ob.getValue();
                str=ob.getKey();
            }
        }
        return str;
    }
}
