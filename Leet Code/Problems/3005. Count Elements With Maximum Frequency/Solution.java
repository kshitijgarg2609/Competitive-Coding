class Solution
{
    public int maxFrequencyElements(int[] nums)
    {
        int max=0,total=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int freq = map.getOrDefault(num,0)+1;
            map.put(num,freq);
            if(freq>max)
            {
                total=max=freq;
            }
            else if(freq==max)
            {
                total+=freq;
            }
        }
        return total;
    }
}
