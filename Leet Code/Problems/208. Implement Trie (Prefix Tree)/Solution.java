class Trie
{
    class TrieStruct extends HashMap<Character,TrieStruct>
    {
        boolean flag=false;
    }
    TrieStruct ts;
    public Trie()
    {
        ts=new TrieStruct();
    }
    
    public void insert(String word)
    {
        TrieStruct ptr=ts;
        for(char c : word.toCharArray())
        {
            ptr.putIfAbsent(c,new TrieStruct());
            ptr=ptr.get(c);
        }
        ptr.flag=true;
    }
    
    public boolean search(String word)
    {
        TrieStruct ptr=ts;
        for(char c : word.toCharArray())
        {
            ptr=ptr.get(c);
            if(ptr==null)
            {
                return false;
            }
        }
        return ptr.flag;
    }
    
    public boolean startsWith(String prefix)
    {
        TrieStruct ptr=ts;
        for(char c : prefix.toCharArray())
        {
            ptr=ptr.get(c);
            if(ptr==null)
            {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
