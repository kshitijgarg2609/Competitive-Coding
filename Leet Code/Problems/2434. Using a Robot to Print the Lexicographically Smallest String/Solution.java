class Solution
{
    public String robotWithString(String s)
    {
        int cnt[] = new int[26];
        IntStream.range(0,s.length()).forEach(i->cnt[s.charAt(i)-'a']++);
        Stack<Character> t = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char min='a';
        for(char c : s.toCharArray())
        {
            t.push(c);
            cnt[c-'a']--;
            for(;min<'z' && cnt[min-'a']==0;min=(char)(min+1));
            for(;!t.isEmpty() && t.peek()<=min;sb.append(t.pop()));
        }
        return sb.toString();
    }
}
