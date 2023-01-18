class Solution
{
    public char findTheDifference(String s, String t)
    {
        Map<Integer,Long> map = t.chars().boxed().collect
        (Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(char c : s.toCharArray())
        {
            if(map.containsKey(Integer.valueOf(c)))
            {
                map.computeIfPresent(Integer.valueOf(c),(key,value)->value-1);
                if(map.get(Integer.valueOf(c))==0)
                {
                    map.remove(Integer.valueOf(c));
                }
            }
            else
            {
                return c;
            }
        }
        return (char)(map.entrySet().iterator().next().getKey().intValue());
    }
}
