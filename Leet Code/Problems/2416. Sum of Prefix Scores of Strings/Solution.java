class Solution
{
    class TrieStruct extends HashMap<Character,TrieStruct>
    {
        int cnt=0;
        public void insert(String word)
        {
            TrieStruct ptr=this;
            for(char c : word.toCharArray())
            {
                ptr.putIfAbsent(c,new TrieStruct());
                ptr.get(c).cnt++;
                ptr=ptr.get(c);
            }
        }
        public int searchPrefixLength(String word)
        {
            int len=0;
            TrieStruct ptr=this;
            for(char c : word.toCharArray())
            {
                len+=ptr.getOrDefault(c,new TrieStruct()).cnt;
                ptr=ptr.get(c);
                if(ptr==null)
                {
                    break;
                }
            }
            return len;
        }
    }
    public int[] sumPrefixScores(String[] words)
    {
        TrieStruct ts = new TrieStruct();
        for(String word : words)
        {
            ts.insert(word);
        }
        return IntStream.range(0,words.length).map(i->ts.searchPrefixLength(words[i])).toArray();
    }
}
