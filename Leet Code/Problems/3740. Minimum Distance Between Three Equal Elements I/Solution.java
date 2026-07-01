class Solution
{
    public int minimumDistance(int[] nums)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int in=0;in<nums.length;in++)
        {
            map.computeIfAbsent(nums[in],k->new ArrayList<>()).add(in);
        }
        return map.values().stream().filter(l->l.size()>=3).flatMapToInt(l->IntStream.range(1,l.size()-1).map(i->2*(l.get(i+1)-l.get(i-1)))).min().orElse(-1);
    }
}
