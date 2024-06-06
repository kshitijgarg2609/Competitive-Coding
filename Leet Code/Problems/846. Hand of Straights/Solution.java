class Solution
{
    public boolean isNStraightHand(int[] hand, int groupSize)
    {
        if(hand.length%groupSize!=0)
        {
            return false;
        }
        NavigableMap<Integer,Integer> map = new TreeMap<>();
        for(int h : hand)
        {
            map.put(h,map.getOrDefault(h,0)+1);
        }
        while(map.size()>0)
        {
            Map.Entry<Integer,Integer> ent = map.pollFirstEntry();
            for(int current=ent.getKey(),i=1;i<groupSize;i++)
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
