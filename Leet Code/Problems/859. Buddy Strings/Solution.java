class Solution
{
    public boolean buddyStrings(String s, String goal)
    {
        if(s.length()!=goal.length())
        {
            return false;
        }
        int cnt[][] = new int[2][26];
        int diff=0;
        for(int i=0;i<s.length();i++)
        {
            cnt[0][s.charAt(i)-'a']++;
            cnt[1][goal.charAt(i)-'a']++;
            if(s.charAt(i)!=goal.charAt(i))
            {
                diff++;
            }
        }
        boolean non_zero=false;
        for(int i=0;i<26;i++)
        {
            if(cnt[0][i]!=cnt[1][i])
            {
                return false;
            }
            if(cnt[0][i]>1)
            {
                non_zero=true;
            }
        }
        return (diff==2) || (diff==0 && non_zero);
    }
}
