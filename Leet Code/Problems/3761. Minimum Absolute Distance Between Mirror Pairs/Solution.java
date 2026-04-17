class Solution
{
    public int minMirrorPairDistance(int[] nums)
    {
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                min=Integer.min(min,i-map.get(nums[i]));
            }
            map.put(reverse(nums[i]),i);
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
    public int reverse(int x)
    {
        int c=0;
        for(;x>0;c=(c*10)+(x%10),x/=10);
        return c;
    }
}
