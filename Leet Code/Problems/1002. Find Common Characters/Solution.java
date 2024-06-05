class Solution
{
    public List<String> commonChars(String[] words)
    {
        int cnt[] = new int[26];
        for(char c : words[0].toCharArray())
        {
            cnt[c-'a']++;
        }
        for(int i=1;i<words.length;i++)
        {
            int nxt[] = new int[26];
            for(char c : words[i].toCharArray())
            {
                nxt[c-'a']++;
            }
            for(int j=0;j<26;cnt[j]=Integer.min(cnt[j],nxt[j++]));
        }
        List<String> list = new LinkedList<>();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<cnt[i];j++)
            {
                list.add(Character.toString((char)('a'+i)));
            }
        }
        return list;
    }
}
