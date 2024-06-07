class Solution
{
    class Trie extends HashMap<Character,Trie>
    {
        boolean isWord=false;
        public void addWord(String word)
        {
            Trie t = this;
            for(char c : word.toCharArray())
            {
                t=t.computeIfAbsent(c,k->new Trie());
            }
            t.isWord=true;
        }
        public String replaceWord(String word)
        {
            Trie t = this;
            for(int i=0;i<word.length();i++)
            {
                if(t.containsKey(word.charAt(i)))
                {
                    t = t.get(word.charAt(i));
                }
                else
                {
                    break;
                }
                if(t.isWord)
                {
                    return word.substring(0,i+1);
                }
            }
            return word;
        }
    }
    public String replaceWords(List<String> dictionary, String sentence)
    {
        Trie t = new Trie();
        for(String word : dictionary)
        {
            t.addWord(word);
        }
        String words[] = sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            words[i]=t.replaceWord(words[i]);
        }
        return String.join(" ",words);
    }
}
