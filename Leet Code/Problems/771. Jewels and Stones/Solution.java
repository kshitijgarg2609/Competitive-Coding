class Solution
{
    public int numJewelsInStones(String jewels, String stones)
    {
        long cnt=0;
        Map<Integer,Long> map = stones.chars().boxed().collect
        (Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(char jw : jewels.toCharArray())
        {
            if(map.containsKey((int)jw))
            {
                cnt+=map.get((int)jw);
            }
        }
        return (int)cnt;
    }
}
