class Solution
{
    public boolean isPossibleDivide(int[] nums, int k)
    {
        if(nums.length%k!=0)
        {
            return false;
        }
        NavigableMap<Integer,Integer> map = new TreeMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(map.size()>0)
        {
            Map.Entry<Integer,Integer> ent = map.pollFirstEntry();
            for(int current=ent.getKey(),i=1;i<k;i++)
            {
                if(!map.containsKey(++current))
                {
                    return false;
                }
                if(map.get(current)==1)
                {
                    map.remove(current);
                }
                else
                {
                    map.put(current,map.get(current)-1);
                }
            }
            if(ent.getValue()>1)
            {
                map.put(ent.getKey(),ent.getValue()-1);
            }
        }
        return true;
    }
}
