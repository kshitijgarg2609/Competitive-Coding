class Solution
{
    public int findMaxLength(int[] nums)
    {
        int max=0;
        Map<Integer,Integer> map = new HashMap<>(){{put(0,-1);}};
        for(int i=0,cnt[] = new int[2];i<nums.length;i++)
        {
            cnt[nums[i]]++;
            map.putIfAbsent(cnt[0]-cnt[1],i);
            max=Integer.max(max,i-map.get(cnt[0]-cnt[1]));
        }
        return max;
    }
}
