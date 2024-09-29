class AllOne
{
    class Trie extends HashMap<Character,Trie>
    {
        int frequency=0;
    }
    Trie trie;
    NavigableMap<Integer,Set<String>> tree;
    public AllOne()
    {
        trie=new Trie();
        tree=new TreeMap<>();
    }
    
    public void inc(String key)
    {
        Trie t = trie;
        for(char c : key.toCharArray())
        {
            t=t.computeIfAbsent(c,k->new Trie());
        }
        int p=t.frequency,n=++t.frequency;
        if(p>0)
        {
            Set<String> set = tree.get(p);
            set.remove(key);
            if(set.size()==0)
            {
                tree.remove(p);
            }
        }
        tree.computeIfAbsent(n,k->new HashSet<>()).add(key);
    }
    
    public void dec(String key)
    {
        Trie t = trie;
        for(char c : key.toCharArray())
        {
            t=t.computeIfAbsent(c,k->new Trie());
        }
        int p=t.frequency,n=--t.frequency;
        Set<String> set = tree.get(p);
        set.remove(key);
        if(set.size()==0)
        {
            tree.remove(p);
        }
        if(n>0)
        {
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
