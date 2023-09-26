class Solution
{
    public String smallestSubsequence(String s)
    {
        int freq[] = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
        }
        boolean vis[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(vis[c-'a'])
            {
                freq[c-'a']--;
                continue;
            }
            for(;!st.isEmpty() && c<st.peek() && freq[st.peek()-'a']>0;vis[st.pop()-'a']=false);
            st.push(c);
            freq[c-'a']--;
            vis[c-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        st.stream().forEach(x->sb.append(x));
        return sb.toString();
    }
}
