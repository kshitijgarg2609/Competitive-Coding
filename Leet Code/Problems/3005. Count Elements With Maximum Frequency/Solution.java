class Solution
{
    public int maxFrequencyElements(int[] nums)
    {
        int max=0,cnt=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int val = map.getOrDefault(num,0)+1;
            map.put(num,val);
            max=Integer.max(max,val);
        }
        for(Map.Entry<Integer,Integer> ob : map.entrySet())
        {
            if(ob.getValue().intValue()==max)
            {
                cnt++;
            }
        }
        return cnt*max;
    }
}
