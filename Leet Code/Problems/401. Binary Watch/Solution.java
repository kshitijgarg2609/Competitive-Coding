class Solution
{
    public List<String> readBinaryWatch(int turnedOn)
    {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0;i<60;i++)
        {
            int bitcount=Integer.bitCount(i);
            List<Integer> li = map.getOrDefault(bitcount,new ArrayList<>());
            li.add(i);
            if(li.size()==1)
            {
                map.put(bitcount,li);
            }
        }
        for(Map.Entry<Integer,List<Integer>> ent : map.entrySet())
        {
            int m_key=turnedOn-ent.getKey().intValue();
            if(!map.containsKey(m_key))
            {
                continue;
            }
            for(Integer h : ent.getValue())
            {
                if(h>=12)
                {
                    break;
                }
                for(Integer m : map.get(m_key))
                {
                    list.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return list;
    }
}
