class Solution
{
    public int minOperations(int[] nums)
    {
        Map<Integer,Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        if(map.values().contains(1L))
        {
            return -1;
        }
        int cnt=0;
        for(long val : map.values())
        {
            for(;val%3!=0;val-=2,cnt++);
            cnt+=val/3;
        }
        return cnt;
    }
}
