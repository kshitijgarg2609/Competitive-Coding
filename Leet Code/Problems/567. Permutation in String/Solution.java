class Solution
{
    public boolean checkInclusion(String s1, String s2)
    {
        int cnt[] = new int[26];
        for(int i=0;i<s1.length();cnt[s1.charAt(i++)-'a']++);
        for(int i=0;(i+s1.length())<=s2.length();i++)
        {
            if(cnt[s2.charAt(i)-'a']==0)
            {
                continue;
            }
            int f[] = Arrays.copyOf(cnt,cnt.length);
            for(int j=i;j<(i+s1.length());f[s2.charAt(j++)-'a']--);
            if(Arrays.stream(f).filter(c->c==0).count()==26)
            {
                return true;
            }
        }
        return false;
    }
}
