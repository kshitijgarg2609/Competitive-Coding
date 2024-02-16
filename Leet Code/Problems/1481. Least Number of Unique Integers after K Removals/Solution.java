class Solution
{
    public int findLeastNumOfUniqueInts(int[] arr, int k)
    {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new TreeMap<>();
        for(int a : arr)
        {
            map1.put(a,map1.getOrDefault(a,0)+1);
        }
        for(int freq : map1.values())
        {
            map2.put(freq,map2.getOrDefault(freq,0)+1);
        }
        for(Iterator<Map.Entry<Integer,Integer>> it=map2.entrySet().iterator();it.hasNext() && k>0;)
        {
            Map.Entry<Integer,Integer> ent = it.next();
            for(;k>=ent.getKey() && ent.getValue()>0;ent.setValue(ent.getValue()-1),k-=ent.getKey());
            if(ent.getValue().intValue()==0)
            {
                it.remove();
            }
        }
        return map2.values().stream().mapToInt(Integer::intValue).sum();
    }
}
