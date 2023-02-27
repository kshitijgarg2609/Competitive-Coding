class Solution
{
    public int numIdenticalPairs(int[] nums)
    {
        Map<Integer,Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int cnt=0;
        for(long x : map.values())
        {
            if(x>=2)
            {
                cnt+=(int)((x*(x-1))/2);
            }
        }
        return cnt;
    }
}
