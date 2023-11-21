class Solution
{
    public int countNicePairs(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int cnt=0,mod=(int)(1e9+7);
        for(int num : nums)
        {
            int key=num-Integer.parseInt(new StringBuilder().append(num).reverse().toString());
            cnt=(cnt+map.getOrDefault(key,0))%mod;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return cnt;
    }
}
