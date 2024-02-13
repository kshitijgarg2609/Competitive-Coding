class RandomizedSet
{
    private List<Integer> list;
    private Map<Integer,Integer> map;
    public RandomizedSet()
    {
        list=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public boolean insert(int val)
    {
        if(map.containsKey(val))
        {
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val)
    {
        if(!map.containsKey(val))
        {
            return false;
        }
        if(map.get(val).intValue()!=list.size()-1)
        {
            Collections.swap(list,map.get(val),list.size()-1);
            map.put(list.get(map.get(val)),map.remove(val));
        }
        else
        {
            map.remove(val);
        }
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom()
    {
        return list.get((int)(Math.random()*list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
