class Solution
{
    public int countHomogenous(String s)
    {
        int mod=(int)(1e9+7);
        int cnt=0;
        for(int i=0;i<s.length();)
        {
            for(int add=1,ch=s.charAt(i);i<s.length() && s.charAt(i)==ch;i++,cnt=(cnt+add++)%mod);
        }
        return cnt;
    }
}
