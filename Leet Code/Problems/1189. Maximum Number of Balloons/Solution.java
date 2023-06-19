class Solution
{
    public int maxNumberOfBalloons(String text)
    {
        Map<Integer,Long> balloon = "balloon".chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Integer,Long> map = text.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int cnt=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Long> ent : balloon.entrySet())
        {
            if(!map.containsKey(ent.getKey()))
            {
                return 0;
            }
            cnt=(int)(Long.min(cnt,map.get(ent.getKey())/ent.getValue()));
        }
        return cnt;
    }
}
