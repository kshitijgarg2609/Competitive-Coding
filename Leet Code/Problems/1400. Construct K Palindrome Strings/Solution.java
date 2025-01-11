class Solution
{
    public boolean canConstruct(String s, int k)
    {
        if(k>s.length()) return false;
        int cnt[] = new int[26];
        s.chars().forEach(c->cnt[c-'a']++);
        return IntStream.range(0,26).filter(i->cnt[i]%2==1).count()<=k;
    }
}
