class Solution
{
    public int findTargetSumWays(int[] nums, int target)
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            Map<Integer,Integer> nxt = new HashMap<>();
            for(Map.Entry<Integer,Integer> ent : map.entrySet())
            {
                nxt.put(ent.getKey()-nums[i],nxt.getOrDefault(ent.getKey()-nums[i],0)+ent.getValue());
                nxt.put(ent.getKey()+nums[i],nxt.getOrDefault(ent.getKey()+nums[i],0)+ent.getValue());
            }
            map=nxt;
        }
        return map.getOrDefault(target,0);
    }
}
