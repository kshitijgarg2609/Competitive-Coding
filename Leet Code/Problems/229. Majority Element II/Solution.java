class Solution
{
    public List<Integer> majorityElement(int[] nums)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else if(map.size()<2)
            {
                map.put(num,1);
            }
            else
            {
                Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
                while(it.hasNext())
                {
                    Map.Entry<Integer,Integer> ent = it.next();
                    if(ent.getValue()==1)
                    {
                        it.remove();
                    }
                    else
                    {
                        ent.setValue(ent.getValue()-1);
                    }
                }
            }
        }
        map.entrySet().stream().forEach(x->x.setValue(0));
        Arrays.stream(nums).filter(i->map.containsKey(i)).forEach(i->map.put(i,map.get(i)+1));
        return map.entrySet().stream().filter(x->x.getValue()>(nums.length/3)).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
