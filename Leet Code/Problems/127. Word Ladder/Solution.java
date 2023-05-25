class Solution
{
    class Trie extends HashMap<Character,Trie>
    {
        boolean flag=false;
        void add(String s)
        {
            Trie trie=this;
            for(char c : s.toCharArray())
            {
                trie.putIfAbsent(c,new Trie());
                trie=trie.get(c);
            }
            trie.flag=true;
        }
        boolean searchAndRemove(char s[])
        {
            Trie trie=this;
            for(char c : s)
            {
                if(trie.containsKey(c))
                {
                    trie=trie.get(c);
                }
                else
                {
                    return false;
                }
            }
            boolean res=trie.flag;
            trie.flag=false;
            return res;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        Trie trie = new Trie();
        for(String w : wordList)
        {
            trie.add(w);
        }
        int ans=Integer.MAX_VALUE;
        Queue<Object[]> qu = new LinkedList<>();
        qu.add(new Object[]{beginWord,Integer.valueOf(1)});
        while(!qu.isEmpty())
        {
            char wrd[]=((String)qu.peek()[0]).toCharArray();
            Integer dist=(Integer)qu.remove()[1];
            if(endWord.equals(new String(wrd)))
            {
                ans=Integer.min(ans,dist);
                continue;
            }
            for(int i=0;i<wrd.length;i++)
            {
                char c=wrd[i];
                for(char j='a';j<='z';j=(char)(j+1))
                {
                    if(j==c)
                    {
                        continue;
                    }
                    wrd[i]=j;
                    if(trie.searchAndRemove(wrd))
                    {
                        qu.add(new Object[]{new String(wrd),new Integer(dist+1)});
                    }
                }
                wrd[i]=c;
            }
        }
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}
