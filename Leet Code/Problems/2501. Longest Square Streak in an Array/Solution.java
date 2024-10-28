class Solution
{
    public int longestSquareStreak(int[] nums)
    {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int sqrt=(int)(Math.sqrt(num));
            int cnt=1;
            if(sqrt*sqrt==num && map.containsKey(sqrt))
            {
                cnt+=map.get(sqrt);
            }
            map.put(num,cnt);
        }
        return map.values().stream().mapToInt(Integer::intValue).filter(cnt->cnt>1).max().orElse(-1);
    }
}
