class Solution
{
    public int tupleSameProduct(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                map.put(nums[i]*nums[j],map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        return map.values().stream().mapToInt(v->((v-1)*v)/2).map(v->v*8).sum();
    }
}
