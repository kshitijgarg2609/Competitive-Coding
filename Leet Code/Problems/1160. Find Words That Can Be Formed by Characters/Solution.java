class Solution
{
    public int countCharacters(String[] words, String chars)
    {
        Map<Integer,Long> map = chars.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return Arrays.stream(words)
        .mapToInt(str->
        {
            int sum=0;
            Map<Integer,Long> freq = str.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            for(Map.Entry<Integer,Long> ob : freq.entrySet())
            {
                if(!map.containsKey(ob.getKey()) || map.get(ob.getKey())<ob.getValue())
                {
                    return 0;
                }
                sum+=ob.getValue().intValue();
            }
            return sum;
        }).sum();
    }
}
