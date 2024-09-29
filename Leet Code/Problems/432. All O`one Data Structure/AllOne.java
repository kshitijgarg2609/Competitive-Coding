class AllOne
{
    Map<String,Integer> map;
    NavigableMap<Integer,Set<String>> tree;
    public AllOne()
    {
        map=new HashMap<>();
        tree=new TreeMap<>();
    }
    
    public void inc(String key)
    {
        int p=0,n=1;
        if(map.containsKey(key))
        {
            p=map.get(key);
            n=p+1;
            Set<String> set = tree.get(p);
            set.remove(key);
            if(set.size()==0)
            {
                tree.remove(p);
            }
        }
        map.put(key,n);
        tree.computeIfAbsent(n,k->new HashSet<>()).add(key);
    }
    
    public void dec(String key)
    {
        int p=map.get(key),n=p-1;
        Set<String> set = tree.get(p);
        set.remove(key);
        if(set.size()==0)
        {
            tree.remove(p);
        }
        if(n==0)
        {
            map.remove(key);
        }
        else
        {
            map.put(key,n);
            tree.computeIfAbsent(n,k->new HashSet<>()).add(key);
        }
    }
    
    public String getMaxKey()
    {
        if(tree.size()==0)
        {
            return "";
        }
        return tree.lastEntry().getValue().iterator().next();
    }
    
    public String getMinKey()
    {
        if(tree.size()==0)
        {
            return "";
        }
        return tree.firstEntry().getValue().iterator().next();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
