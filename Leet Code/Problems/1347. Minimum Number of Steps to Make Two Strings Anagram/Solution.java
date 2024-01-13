class Solution
{
    public int minSteps(String s, String t)
    {
        int cnt[] = new int[26];
        for(int i=0;i<s.length();cnt[s.charAt(i)-'a']++,cnt[t.charAt(i++)-'a']--);
        return Arrays.stream(cnt).filter(x->x>0).sum();
    }
}
