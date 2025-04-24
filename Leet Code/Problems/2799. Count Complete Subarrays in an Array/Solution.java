class Solution
{
    public int countCompleteSubarrays(int[] nums)
    {
        int cnt=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0,j=0;i<nums.length;i++)
        {
            Map<Integer,Integer> m = new HashMap<>();
            for(j=i;j<nums.length;j++)
            {
                m.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(m.keySet().equals(map.keySet()))
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
