class Solution
{
    public boolean canConstruct(String ransomNote, String magazine)
    {
        Map<Integer,Long> map = magazine.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Integer,Long> ob : ransomNote.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet())
        {
            if(!map.containsKey(ob.getKey()) || ob.getValue().intValue()>map.get(ob.getKey()).intValue())
            {
                return false;
            }
        }
        return true;
    }
}
