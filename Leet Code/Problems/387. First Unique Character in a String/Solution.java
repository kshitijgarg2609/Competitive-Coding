class Solution
{
    public int firstUniqChar(String s)
    {
        int indx[] = new int[26];
        int cnt[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(cnt[s.charAt(i)-'a']++==0)
            {
                indx[s.charAt(i)-'a']=i;
            }
        }
        return IntStream.range(0,26).filter(i->cnt[i]==1).map(i->indx[i]).min().orElse(-1);
    }
}
