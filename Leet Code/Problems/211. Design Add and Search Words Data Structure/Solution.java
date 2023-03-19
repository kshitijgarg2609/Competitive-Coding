class WordDictionary
{
    class Trie extends HashMap<Character,Trie>
    {
        boolean flag=false;
    }
    Trie tr;
    public WordDictionary()
    {
        tr=new Trie();
    }
    
    public void addWord(String word)
    {
        Trie ptr=tr;
        for(char c : word.toCharArray())
        {
            ptr.putIfAbsent(c,new Trie());
            ptr=ptr.get(c);
        }
        ptr.flag=true;
    }
    
    public boolean search(String word)
    {
        List<Trie> qu = new LinkedList<>(){{add(tr);}};
        for(char c : word.toCharArray())
        {
            if(c=='.')
            {
                List<Trie> nxt = new LinkedList<>(qu);
                qu.clear();
                for(Trie t : nxt)
                {
                    qu.addAll(t.values());
                }
                continue;
            }
            ListIterator<Trie> it = qu.listIterator();
            while(it.hasNext())
            {
                Trie nxt=it.next();
                if(nxt.containsKey(c))
                {
                    it.set(nxt.get(c));
                }
                else
                {
                    it.remove();
                }
            }
            if(qu.size()==0)
            {
                return false;
            }
        }
        for(Trie t : qu)
        {
            if(t.flag)
            {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
