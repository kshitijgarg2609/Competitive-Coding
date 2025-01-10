class Solution
{
    public List<String> wordSubsets(String[] words1, String[] words2)
    {
        int mx[] = new int[26];
        for(String w : words2)
        {
            int cnt[] = new int[26];
            w.chars().forEach(c->cnt[c-'a']++);
            for(int i=0;i<26;i++)
            {
                mx[i]=Integer.max(mx[i],cnt[i]);
            }
        }
        List<String> list = new LinkedList<>();
        for(String w : words1)
        {
            int cnt[] = new int[26];
            w.chars().forEach(c->cnt[c-'a']++);
            int i=0;
            for(;i<26 && cnt[i]>=mx[i];i++);
            if(i==26)
            {
                list.add(w);
            }
        }
        return list;
    }
}
