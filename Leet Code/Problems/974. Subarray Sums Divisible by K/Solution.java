class Solution
{
    public int subarraysDivByK(int[] nums, int k)
    {
        int cnt=0;
        Map<Integer,Integer> map = new HashMap<>(){{put(0,1);}};
        for(int i=0,sum=0;i<nums.length;i++)
        {
            sum=(sum+(nums[i]%k)+k)%k;
            cnt+=map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
